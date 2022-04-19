package soliddemo.isp.deps

import soliddemo.isp.deps.pre.BondInvestment
import soliddemo.isp.deps.pre.SavingsInvestment
import soliddemo.isp.deps.pre.StockInvestment
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

        println("O nome do asset é ${it.getAssetName()}")
        println("O valor atual do asset é ${it.getCurrentValue()}")
        println("O valor para retirada é ${it.getWithdrawalAmount()}")
        println("O valor de juros anualizado é ${it.getYearlyInterest()}%")
        println("\n=================================\n")
    }

}
