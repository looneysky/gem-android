/**
 * Generated by typeshare 1.11.0
 */

package com.wallet.core.primitives

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class TransactionType(val string: String) {
	@SerialName("transfer")
	Transfer("transfer"),
	@SerialName("swap")
	Swap("swap"),
	@SerialName("tokenApproval")
	TokenApproval("tokenApproval"),
	@SerialName("stakeDelegate")
	StakeDelegate("stakeDelegate"),
	@SerialName("stakeUndelegate")
	StakeUndelegate("stakeUndelegate"),
	@SerialName("stakeRewards")
	StakeRewards("stakeRewards"),
	@SerialName("stakeRedelegate")
	StakeRedelegate("stakeRedelegate"),
	@SerialName("stakeWithdraw")
	StakeWithdraw("stakeWithdraw"),
}

