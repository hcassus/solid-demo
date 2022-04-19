package soliddemo.dip.deps.post

import soliddemo.dip.deps.domain.PaymentType
import java.util.UUID

class CardPurchaser(val paymentGateway: PaymentGateway) {

    fun purchase(amount: Double, orderId: UUID) {
        paymentGateway.pay(PaymentType.CARD, amount)
        println("Liberando pedido $orderId no valor de $amount")
    }
}
