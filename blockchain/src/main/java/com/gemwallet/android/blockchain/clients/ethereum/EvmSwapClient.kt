package com.gemwallet.android.blockchain.clients.ethereum

import com.gemwallet.android.blockchain.clients.SwapClient
import com.gemwallet.android.blockchain.rpc.model.JSONRpcRequest
import com.gemwallet.android.math.toHexString
import com.wallet.core.primitives.AssetId
import com.wallet.core.primitives.Chain
import wallet.core.jni.AnyAddress
import wallet.core.jni.CoinType
import wallet.core.jni.EthereumAbi
import wallet.core.jni.EthereumAbiFunction
import java.math.BigInteger

class EvmSwapClient(
    private val chain: Chain,
    private val client: EvmRpcClient,
) : SwapClient {

    override suspend fun getAllowance(
        assetId: AssetId,
        owner: String,
        spender: String
    ): BigInteger {
        if (assetId.tokenId == null) {
            return BigInteger.ONE
        }
        val function = EthereumAbiFunction("allowance").apply {
            addParamAddress(AnyAddress(owner, CoinType.ETHEREUM).data(), false)
            addParamAddress(AnyAddress(spender, CoinType.ETHEREUM).data(), false)
        }
        val encodedFn = EthereumAbi.encode(function)
        val request = JSONRpcRequest.create(
            EvmMethod.Call,
            listOf(
                EvmRpcClient.AllowanceCall(
                    owner,
                    assetId.tokenId!!,
                    encodedFn.toHexString()
                ),
                "latest",
            ),
        )
        return client.callNumber(request).fold(
            onSuccess = {
                it.result?.value ?: BigInteger.ZERO
            },
            onFailure = {
                BigInteger.ZERO
            }
        )
    }

    override fun maintainChain(): Chain = chain
}