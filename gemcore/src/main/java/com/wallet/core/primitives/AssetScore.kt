/**
 * Generated by typeshare 1.12.0
 */

package com.wallet.core.primitives

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class AssetScore (
	val rank: Int
)

@Serializable
enum class AssetRank(val string: String) {
	@SerialName("high")
	High("high"),
	@SerialName("medium")
	Medium("medium"),
	@SerialName("low")
	Low("low"),
	@SerialName("trivial")
	Trivial("trivial"),
	@SerialName("unknown")
	Unknown("unknown"),
	@SerialName("inactive")
	Inactive("inactive"),
	@SerialName("abandoned")
	Abandoned("abandoned"),
	@SerialName("suspended")
	Suspended("suspended"),
	@SerialName("migrated")
	Migrated("migrated"),
	@SerialName("deprecated")
	Deprecated("deprecated"),
	@SerialName("spam")
	Spam("spam"),
	@SerialName("fradulent")
	Fradulent("fradulent"),
}

