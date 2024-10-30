package com.gemwallet.android.data.repositories.asset

import com.gemwallet.android.data.database.AssetsDao
import com.gemwallet.android.ext.toIdentifier
import com.wallet.core.primitives.Asset
import com.wallet.core.primitives.AssetId

class GetAssetByIdCase(
    private val assetsDao: AssetsDao,
) {
    suspend fun getById(assetId: AssetId): Asset? {
        val room = assetsDao.getById(assetId.toIdentifier()).firstOrNull() ?: return null
        return Asset(
            id = assetId,
            name = room.name,
            symbol = room.symbol,
            decimals = room.decimals,
            type = room.type,
        )
    }
}