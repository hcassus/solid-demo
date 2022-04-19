package soliddemo.lsp.deps

import soliddemo.lsp.deps.pre.CompositePercentageFee
import soliddemo.lsp.deps.pre.FixedFee
import soliddemo.lsp.deps.FeeCalculator
import soliddemo.lsp.deps.pre.PercentageFee

fun main() {
    val feeCalculator = FeeCalculator()

    val fees = listOf(
        FixedFee(50.0), // Taxa de atraso
        PercentageFee(0.05), // Multa de atraso
        CompositePercentageFee(0.02, 12), // Juros por 12 meses
    )

    val originalAmount = 100.0
    val finalAmount = feeCalculator.calculateAmountToPay(originalAmount, fees)

    println("O valor final da despesa é $finalAmount... #SQN")

}
