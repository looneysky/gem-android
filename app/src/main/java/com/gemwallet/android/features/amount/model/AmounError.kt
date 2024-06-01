package com.gemwallet.android.features.amount.model

import java.math.BigInteger

sealed interface AmountError {
    data object None : AmountError

    data object Init : AmountError

    data object Required : AmountError

    data object Unavailable : AmountError

    data object IncorrectAmount : AmountError

    data object ZeroAmount : AmountError

    class InsufficientBalance(val assetName: String) : AmountError

    class MinimumValue(val minimumValue: String) : AmountError
}