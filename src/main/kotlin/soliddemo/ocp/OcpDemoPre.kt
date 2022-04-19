package soliddemo.ocp

import soliddemo.ocp.deps.domain.Asset
import soliddemo.ocp.deps.pre.PortfolioCalculatorPre

fun main() {

    val stockPurchases = listOf(
        Asset("APC", 3.0, 152.1295),
        Asset("APC", 2.0, 150.0214),
        Asset("APC", 5.0, 149.7447),
        Asset("7BC", 4.0, 0.1045),
        Asset("7BC", 10.0, 0.0950),
        Asset("7BC", 2.0, 0.1160),

    )

    val currencyPurchases = listOf(
        Asset("USD", 100.0, 4.6767),
        Asset("USD", 300.0, 4.6965),
        Asset("USD", 400.0, 4.6526),
    )

    val portfolioCalculator = PortfolioCalculatorPre()

    val totalStocks = portfolioCalculator.totalizeAssets(stockPurchases)
    val totalCurrency = portfolioCalculator.totalizeAssets(currencyPurchases)

    println("Seu portfólio de ações:\n $totalStocks")
    println("Seu portfólio de moedas:\n $totalCurrency")


    val totalStocksUpd = portfolioCalculator.totalizeAssetsUpdated(stockPurchases)
    val totalCurrencyUpd = portfolioCalculator.totalizeAssetsUpdated(currencyPurchases)

    println("\n==============================================\n")
    println("[ATUALIZADO] Seu portfólio de ações:\n $totalStocksUpd")
    println("[ATUALIZADO] Seu portfólio de moedas:\n $totalCurrencyUpd")
}
