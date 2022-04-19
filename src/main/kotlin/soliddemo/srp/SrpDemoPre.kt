package soliddemo.srp

import soliddemo.srp.deps.domain.CreditCardDebit
import soliddemo.srp.deps.domain.Mortgage
import soliddemo.srp.deps.pre.MultiCalculator

fun main() {

    val multiCalculator = MultiCalculator()

    val mortgage = Mortgage(
        baseValue = 300_000.00,
        interest = 0.1,
        period = 25
    )

    val finalMortgageValue = multiCalculator.calculateFinalValue(mortgage)
    val mortgageIntnstallment = multiCalculator.calculateInstallments(mortgage)

    println("O valor final do imovel é $finalMortgageValue, com parcelas mensais de $mortgageIntnstallment")

    val creditCardDebit = CreditCardDebit(
        currentDebit = 1000.00,
        payment = 400.00,
        interest = 0.12,
        lateFee = 0.02
    )

    val monthsToFinance = 12

    val cardResidualValue = multiCalculator.calculateResidualValue(creditCardDebit)
    val creditCardIntnstallment = multiCalculator.calculateInstallments(creditCardDebit, 12)

    println("O valor pendente é $cardResidualValue, " +
        "ou parcelas mensais de $creditCardIntnstallment " +
        "se financiado em $monthsToFinance meses")

}

