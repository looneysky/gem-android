/**
 * Generated by typeshare 1.11.0
 */

package com.wallet.core.blockchain.bitcoin.models

import kotlinx.serialization.Serializable

@Serializable
data class BitcoinTransaction (
	val blockHeight: Int
)

@Serializable
data class BitcoinTransactionBroacastError (
	val message: String
)

@Serializable
data class BitcoinTransactionBroacastResult (
	val error: BitcoinTransactionBroacastError? = null,
	val result: String? = null
)

