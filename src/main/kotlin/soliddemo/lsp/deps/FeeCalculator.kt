package soliddemo.lsp.deps

import soliddemo.lsp.deps.domain.Fee

class FeeCalculator {

    fun calculateAmountToPay(debtAmount: Double, fees: List<Fee>): Double {
        val totalFees = fees
            .map { it.value }
            .reduceOrNull(Double::plus) ?: 0.0
        return totalFees + debtAmount
    }

}
