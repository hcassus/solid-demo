package soliddemo.isp.deps

import soliddemo.isp.deps.post.BondInvestment
import soliddemo.isp.deps.post.EarningInvestment
import soliddemo.isp.deps.post.Investment
import soliddemo.isp.deps.post.LiquidableInvestment
import soliddemo.isp.deps.post.NamedAsset
import soliddemo.isp.deps.post.SavingsInvestment
import soliddemo.isp.deps.post.StockInvestment
import java.time.LocalDate

fun main() {
    val investments = listOf(
        SavingsInvestment(
            amount = 1000.0,
            interest = 0.005,
            depositDate = LocalDate.of(1999, 11, 23)
        ),
        BondInvestment(
            bondName = "Tesouro Prefixado 2029",
            price = 464.67,
            prefixedRate = 12.16
        ),
        StockInvestment(
            asset = "AMZ",
            initialAmount = 15.0,
            purchasePrice = 14_687.55
        ),
    )

    investments.forEach {
        println("\n=================================\n")
        println("Apresentando um ${it.javaClass.simpleName}")

        if(it is NamedAsset)
            println("O nome do asset é ${it.getAssetName()}")

        if(it is Investment)
            println("O valor atual do asset é ${it.getCurrentValue()}")

        if (it is LiquidableInvestment)
            println("O valor para retirada é ${it.getWithdrawalAmount()}")

        if(it is EarningInvestment)
            println("O valor de juros anualizado é ${it.getYearlyInterest()}%")

        println("\n=================================\n")
    }
}
