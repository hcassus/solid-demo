package soliddemo.dip.deps.pre

import soliddemo.dip.deps.domain.PaymentType

class CieloGateway {

    fun pay(type: PaymentType, amount: Double) {
        println("Enviando um pagamento $type de $amount via Cielo")
    }

}
