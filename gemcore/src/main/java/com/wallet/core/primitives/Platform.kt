/**
 * Generated by typeshare 1.12.0
 */

package com.wallet.core.primitives

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
enum class Platform(val string: String) {
	@SerialName("ios")
	IOS("ios"),
	@SerialName("android")
	Android("android"),
}

@Serializable
enum class PlatformStore(val string: String) {
	@SerialName("appStore")
	AppStore("appStore"),
	@SerialName("googlePlay")
	GooglePlay("googlePlay"),
	@SerialName("fdroid")
	Fdroid("fdroid"),
	@SerialName("huawei")
	Huawei("huawei"),
	@SerialName("solanaStore")
	SolanaStore("solanaStore"),
	@SerialName("samsungStore")
	SamsungStore("samsungStore"),
	@SerialName("apkUniversal")
	ApkUniversal("apkUniversal"),
	@SerialName("local")
	Local("local"),
}

