/**
 * Generated by typeshare 1.7.0
 */

@file:NoLiveLiterals

package com.wallet.core.blockchain.bnbchain.models

import androidx.compose.runtime.NoLiveLiterals
import kotlinx.serialization.*

@Serializable
data class BNBChainNodeInfo (
	val network: String
)

@Serializable
data class BNBChainSyncInfo (
	val catchingUp: Boolean
)

@Serializable
data class BNBChainNodeInfoResponse (
	val nodeInfo: BNBChainNodeInfo,
	val syncInfo: BNBChainSyncInfo
)

