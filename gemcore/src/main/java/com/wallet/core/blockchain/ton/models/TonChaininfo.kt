/**
 * Generated by typeshare 1.11.0
 */

package com.wallet.core.blockchain.ton.models

import kotlinx.serialization.Serializable

@Serializable
data class TonBlock (
	val seqno: Int,
	val root_hash: String
)

@Serializable
data class TonMasterchainInfo (
	val last: TonBlock
)

