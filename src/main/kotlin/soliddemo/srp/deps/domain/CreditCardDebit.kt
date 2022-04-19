package soliddemo.srp.deps.domain

data class CreditCardDebit(
    val currentDebit: Double,
    val payment: Double,
    val interest: Double,
    val lateFee: Double
)
