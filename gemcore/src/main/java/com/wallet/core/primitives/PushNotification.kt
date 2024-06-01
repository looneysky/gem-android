/**
 * Generated by typeshare 1.9.2
 */

@file:NoLiveLiterals

package com.wallet.core.primitives

import androidx.compose.runtime.NoLiveLiterals
import kotlinx.serialization.*

@Serializable
enum class PushNotificationTypes(val string: String) {
	@SerialName("transaction")
	Transaction("transaction"),
}

@Serializable
data class PushNotification (
	val type: PushNotificationTypes,
	val data: Transaction
)

