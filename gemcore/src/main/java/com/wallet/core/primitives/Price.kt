/**
 * Generated by typeshare 1.11.0
 */

package com.wallet.core.primitives

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class Price (
	val price: Double,
	val priceChangePercentage24h: Double
)

@Serializable
data class PriceData (
	val asset: Asset,
	val price: Price? = null,
	val priceAlert: PriceAlert? = null,
	val details: AssetDetailsInfo? = null
)

