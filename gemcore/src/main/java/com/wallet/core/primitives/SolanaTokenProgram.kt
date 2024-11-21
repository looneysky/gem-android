/**
 * Generated by typeshare 1.12.0
 */

package com.wallet.core.primitives

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
enum class SolanaTokenProgramId(val string: String) {
	@SerialName("token")
	Token("token"),
	@SerialName("token2022")
	Token2022("token2022"),
}

