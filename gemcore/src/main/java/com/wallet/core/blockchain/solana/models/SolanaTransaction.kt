/**
 * Generated by typeshare 1.11.0
 */

package com.wallet.core.blockchain.solana.models

import kotlinx.serialization.Serializable

@Serializable
object SolanaTransactionError

@Serializable
data class SolanaTransactionMeta (
	val err: SolanaTransactionError? = null
)

@Serializable
data class SolanaTransaction (
	val meta: SolanaTransactionMeta,
	val slot: Int
)

