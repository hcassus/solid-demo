package soliddemo.dip.deps.post

import soliddemo.dip.deps.domain.PaymentType

class CieloGateway : PaymentGateway {

    override fun pay(type: PaymentType, amount: Double) {
        println("Enviando um pagamento $type de $amount via Cielo")
    }

}
