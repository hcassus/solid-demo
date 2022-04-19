package soliddemo.dip.deps.post

import soliddemo.dip.deps.domain.PaymentType
import java.util.UUID

class TransferPurchaser(val paymentGateway: PaymentGateway) {

    fun purchase(amount: Double, reference: String, orderId: UUID) {
        paymentGateway.pay(PaymentType.TRANSFER, amount)
        println("Associando referência $reference ao pedido $orderId para processar liberação")
    }
}
