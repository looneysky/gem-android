/**
 * Generated by typeshare 1.12.0
 */

package com.wallet.core.primitives

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
enum class BannerEvent(val string: String) {
	@SerialName("stake")
	Stake("stake"),
	@SerialName("accountActivation")
	AccountActivation("accountActivation"),
	@SerialName("enableNotifications")
	EnableNotifications("enableNotifications"),
	@SerialName("accountBlockedMultiSignature")
	AccountBlockedMultiSignature("accountBlockedMultiSignature"),
}

@Serializable
enum class BannerState(val string: String) {
	@SerialName("active")
	Active("active"),
	@SerialName("cancelled")
	Cancelled("cancelled"),
	@SerialName("alwaysActive")
	AlwaysActive("alwaysActive"),
}

@Serializable
data class Banner (
	val wallet: Wallet? = null,
	val asset: Asset? = null,
	val chain: Chain? = null,
	val event: BannerEvent,
	val state: BannerState
)

