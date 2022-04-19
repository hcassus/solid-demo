package soliddemo.dip.deps.post

import soliddemo.dip.deps.domain.PaymentType

interface PaymentGateway {

    fun pay(type: PaymentType, amount: Double)

}
