/**
 * Generated by typeshare 1.12.0
 */

package com.wallet.core.primitives

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class TransactionSwapMetadata (
	val fromAsset: AssetId,
	val fromValue: String,
	val toAsset: AssetId,
	val toValue: String
)

