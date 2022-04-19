package soliddemo.lsp.deps

import soliddemo.lsp.deps.post.CourseMaterialFee
import soliddemo.lsp.deps.post.EnrollmentFee
import soliddemo.lsp.deps.FeeCalculator

fun main() {
    val feeCalculator = FeeCalculator()

    val fees = listOf(
        CourseMaterialFee(200.0), // Valor de material do curso
        EnrollmentFee(100.0),// Taxa de matricula
    )

    val originalAmount = 800.0 // Valor do curso
    val finalAmount = feeCalculator.calculateAmountToPay(originalAmount, fees)

    println("O valor final do curso é $finalAmount")

}
