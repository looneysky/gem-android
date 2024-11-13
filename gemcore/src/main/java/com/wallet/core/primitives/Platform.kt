/**
 * Generated by typeshare 1.11.0
 */

package com.wallet.core.primitives

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

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
}

