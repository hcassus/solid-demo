package soliddemo.srp.deps.post

import soliddemo.srp.deps.domain.CreditCardDebit
import kotlin.math.pow

class CreditCardCalculator {

    fun calculateResidualValue(creditCardDebit: CreditCardDebit): Double {
        val pending = calculatePendingDebit(creditCardDebit)
        val lateFee = pending * (1 + creditCardDebit.lateFee)
        val financedAmount = pending * (1 + creditCardDebit.interest)
        return lateFee + financedAmount
    }

    private fun calculatePendingDebit(creditCardDebit: CreditCardDebit) =
        creditCardDebit.currentDebit - creditCardDebit.payment

    fun calculateInstallments(creditCardDebit: CreditCardDebit, monthsToFinance: Long): Double {
        return creditCardDebit.currentDebit * (1 + creditCardDebit.interest).pow(monthsToFinance.toDouble()) / monthsToFinance.toDouble()
    }
}
