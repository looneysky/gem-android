ANDROID_HOME ?= ~/Library/Android/sdk
SDK_MANAGER = ${ANDROID_HOME}/cmdline-tools/latest/bin/sdkmanager

install:
	@echo Install Rust
	@curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh

install-typeshare:
	@echo Install typeshare-cli
	@cargo install typeshare-cli --version 1.6.0

install-toolchains:
	@echo Install toolchains for uniffi
	@cd core/gemstone && make prepare-android

core-upgrade:
	git submodule update --recursive --remote

bootstrap: install install-toolchains install-ndk generate

# Android

install-ndk:
	${SDK_MANAGER} "ndk;26.1.10909125"

release:
	./gradlew clean cargoBuild assembleRelease :app:bundleRelease

localize:
	@sh scripts/localize.sh android

generate: install-typeshare generate-stone
	@echo "Generate typeshare for Android"
	@cd core && cargo run --package generate --bin generate android ../gemcore/src/main/java/com/wallet/core

generate-stone:
	@echo "Generate Gemstone lib"
	@cd core/gemstone && make bindgen-kotlin BUILD_MODE=release
	@cp -Rf core/gemstone/generated/kotlin/uniffi gemcore/src/main/java
	./gradlew cargoBuild --info
