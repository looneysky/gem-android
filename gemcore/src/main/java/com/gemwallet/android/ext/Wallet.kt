package com.gemwallet.android.ext

import com.wallet.core.primitives.Account
import com.wallet.core.primitives.Chain
import com.wallet.core.primitives.Wallet

fun Wallet.getAccount(chain: Chain): Account? {
    return accounts.firstOrNull { it.chain == chain }
}