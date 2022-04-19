package soliddemo.srp

import soliddemo.srp.deps.domain.CreditCardDebit
import soliddemo.srp.deps.domain.Mortgage
import soliddemo.srp.deps.post.CreditCardCalculator
import soliddemo.srp.deps.post.MortgageCalculator

fun main() {

    val mortgageCalculator = MortgageCalculator()

    val mortgage = Mortgage(
        baseValue = 300_000.00,
        interest = 0.1,
        period = 25
    )

    val finalMortgageValue = mortgageCalculator.calculateFinalValue(mortgage)
    val mortgageInstallment = mortgageCalculator.calculateInstallments(mortgage)

    println("O valor final do imovel é $finalMortgageValue, com parcelas mensais de $mortgageInstallment")

    val creditCardCalculator = CreditCardCalculator()
    val creditCardDebit = CreditCardDebit(
        currentDebit = 1000.00,
        payment = 400.00,
        interest = 0.12,
        lateFee = 0.02
    )

    val monthsToFinance = 12

    val cardResidualValue = creditCardCalculator.calculateResidualValue(creditCardDebit)
    val creditCardIntnstallment = creditCardCalculator.calculateInstallments(creditCardDebit, 12)

    println(
        "O valor pendente é $cardResidualValue, " +
            "ou parcelas mensais de $creditCardIntnstallment " +
            "se financiado em $monthsToFinance meses"
    )

}
