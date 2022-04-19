package soliddemo.dip

import soliddemo.dip.deps.pre.CardPurchaser
import soliddemo.dip.deps.pre.CieloGateway
import soliddemo.dip.deps.pre.BarCodePurchaser
import soliddemo.dip.deps.pre.TransferPurchaser
import java.util.UUID

fun main() {

    val paymentGateway = CieloGateway()

    val cardMachinePurchaser = CardPurchaser(paymentGateway)
    val barcodePurchaser = BarCodePurchaser(paymentGateway)
    val slowTransferPurchaser = TransferPurchaser(paymentGateway)

    val orderId = UUID.randomUUID()

    cardMachinePurchaser.purchase(20.0, orderId)
    barcodePurchaser.purchase(20.0, "23791111036000000010301000222206148622000000000", orderId)
    slowTransferPurchaser.purchase(20.0, "Pedido $orderId", orderId)
}
