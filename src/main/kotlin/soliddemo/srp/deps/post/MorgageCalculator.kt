package soliddemo.srp.deps.post

import soliddemo.srp.deps.domain.Mortgage

class MortgageCalculator {

    fun calculateFinalValue(mortgage: Mortgage): Double {
        return mortgage.baseValue * (1 + mortgage.interest) * mortgage.period
    }

    fun calculateInstallments(mortgage: Mortgage): Double {
        return calculateFinalValue(mortgage) / (mortgage.period * 12)
    }



}
