package soliddemo.dip.deps.pre

import soliddemo.dip.deps.domain.PaymentType
import java.util.UUID

class BarCodePurchaser(val paymentGateway: CieloGateway) {
    fun purchase(amount: Double, barcode: String, orderId: UUID) {
        paymentGateway.pay(PaymentType.BAR_CODE, amount)
        println("Aguardando pagamento no valor de $amount do pedido $orderId com aprovação para codigo $barcode")
    }
}
