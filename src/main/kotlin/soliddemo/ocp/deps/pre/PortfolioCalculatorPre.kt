package soliddemo.ocp.deps.pre

import soliddemo.ocp.deps.domain.Asset
import kotlin.math.pow
import kotlin.math.round

class PortfolioCalculatorPre {

    fun totalizeAssets(assets: List<Asset>): List<Asset> {
        return assets
            .groupBy { it.asset }
            .map { entry ->
                val assets = entry.value
                Asset(
                    asset = entry.key,
                    amount = assets.map { asset -> asset.amount }.reduceOrNull(Double::plus) ?: 0.0,
                    price = assets.map { asset -> asset.price }.reduceOrNull(Double::plus)?.div(assets.size) ?: 0.0
                )
            }
    }

    fun totalizeAssetsUpdated(assets: List<Asset>): List<Asset> {
        return assets
            .groupBy { it.asset }
            .map { entry ->
                val assets = entry.value
                val totalAmount = assets.map { asset -> asset.amount }.reduceOrNull(Double::plus) ?: 0.0
                val averagePrice = assets.map { asset -> asset.price }.reduceOrNull(Double::plus)?.div(assets.size) ?: 0.0
                Asset(
                    asset = entry.key,
                    amount = roundToPlaces(totalAmount, 2),
                    price = roundToPlaces(averagePrice, 2)
                )
            }
    }

    private fun roundToPlaces(value: Double, decimals: Int): Double {
        val multiplier = 10.0.pow(decimals)
        return round(value * multiplier) / multiplier
    }

}
