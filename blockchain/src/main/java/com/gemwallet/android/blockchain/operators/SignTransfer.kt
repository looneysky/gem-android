package com.gemwallet.android.blockchain.operators

import com.gemwallet.android.model.SignerParams
import com.wallet.core.primitives.Chain

interface SignTransfer {
    suspend operator fun invoke(
        input: SignerParams,
        privateKey: ByteArray
    ): Result<ByteArray>

    suspend operator fun invoke(
        chain: Chain,
        input: ByteArray,
        privateKey: ByteArray,
    ): Result<ByteArray>
}