/**
 * Generated by typeshare 1.11.0
 */

package com.wallet.core.primitives

import kotlinx.serialization.Serializable

@Serializable
data class Asset (
	val id: AssetId,
	val name: String,
	val symbol: String,
	val decimals: Int,
	val type: AssetType
)

