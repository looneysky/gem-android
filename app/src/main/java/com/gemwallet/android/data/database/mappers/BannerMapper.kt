package com.gemwallet.android.data.database.mappers

import com.gemwallet.android.data.database.entities.DbBanner
import com.gemwallet.android.ext.toIdentifier
import com.wallet.core.primitives.Banner

class BannerMapper : Mapper<DbBanner, Banner, Nothing, Nothing> {
    override fun asDomain(entity: DbBanner, options: (() -> Nothing)?): Banner {
        throw IllegalAccessError()
    }

    override fun asEntity(domain: Banner, options: (() -> Nothing)?): DbBanner {
        return DbBanner(
            walletId = domain.wallet?.id ?: "",
            assetId = domain.asset?.id?.toIdentifier() ?: "",
            event = domain.event,
            state = domain.state,
        )
    }
}