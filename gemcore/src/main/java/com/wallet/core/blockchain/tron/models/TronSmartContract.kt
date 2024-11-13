/**
 * Generated by typeshare 1.11.0
 */

package com.wallet.core.blockchain.tron.models

import kotlinx.serialization.Serializable

@Serializable
data class TronSmartContractCall (
	val contract_address: String,
	val function_selector: String,
	val parameter: String? = null,
	val fee_limit: UInt? = null,
	val call_value: UInt? = null,
	val owner_address: String,
	val visible: Boolean? = null
)

@Serializable
data class TronSmartContractResultMessage (
	val result: Boolean,
	val message: String? = null
)

@Serializable
data class TronSmartContractResult (
	val result: TronSmartContractResultMessage,
	val constant_result: List<String>,
	val energy_used: Int
)

