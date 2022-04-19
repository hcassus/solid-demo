package soliddemo.srp.deps.pre

import soliddemo.srp.deps.domain.CreditCardDebit
import soliddemo.srp.deps.domain.Mortgage
import kotlin.math.pow

class MultiCalculator {

    fun calculateFinalValue(mortgage: Mortgage): Double {
        return mortgage.baseValue * (1 + mortgage.interest) * mortgage.period
    }

    fun calculateInstallments(mortgage: Mortgage): Double {
        return calculateFinalValue(mortgage) / (mortgage.period * 12)
    }

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
