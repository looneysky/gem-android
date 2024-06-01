package com.gemwallet.android.blockchain.clients.ethereum

import com.gemwallet.android.blockchain.clients.BroadcastClient
import com.gemwallet.android.blockchain.rpc.model.JSONRpcRequest
import com.gemwallet.android.math.toHexString
import com.wallet.core.primitives.Account
import com.wallet.core.primitives.Chain
import com.wallet.core.primitives.TransactionType

class EvmBroadcastClient(
    private val chain: Chain,
    private val client: EvmRpcClient,
) : BroadcastClient {
    override suspend fun send(account: Account, signedMessage: ByteArray, type: TransactionType): Result<String> {
        val request = JSONRpcRequest.create(EvmMethod.Broadcast, listOf(signedMessage.toHexString()))
        return client.broadcast(request).mapCatching {
            if (it.error != null) throw Exception(it.error.message) else it.result
        }
    }

    override fun maintainChain(): Chain = chain
}