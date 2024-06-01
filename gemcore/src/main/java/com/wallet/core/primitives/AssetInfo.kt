/**
 * Generated by typeshare 1.7.0
 */

@file:NoLiveLiterals

package com.wallet.core.primitives

import androidx.compose.runtime.NoLiveLiterals
import kotlinx.serialization.*

@Serializable
data class AssetLink (
	val name: String,
	val url: String
)

@Serializable
data class AssetInfo (
	val website: String,
	val links: List<AssetLink>
)

@Serializable
data class AssetInfos (
	val asset: Asset,
	val info: AssetInfo? = null
)

