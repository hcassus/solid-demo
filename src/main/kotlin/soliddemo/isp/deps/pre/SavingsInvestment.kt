package soliddemo.isp.deps.pre

import java.time.LocalDate
import java.time.LocalDateTime.now
import java.time.temporal.ChronoUnit
import kotlin.math.pow
import kotlin.random.Random
import kotlin.random.nextInt

class SavingsInvestment(val amount: Double, val interest: Double, val depositDate: LocalDate) : Investment {

    override fun getCurrentValue(): Double {
        val elapsedMonths = ChronoUnit.MONTHS.between(depositDate, now())
        return amount * (1 + interest).pow(elapsedMonths.toDouble())
    }

    override fun getYearlyInterest(): Double {
        return interest * 12
    }

    override fun getWithdrawalAmount(): Double {
        return getCurrentValue()
    }

    override fun getAssetName(): String {
        println("Eita... Tenho nome não :p")
        return ""
    }
}

class StockInvestment(val asset: String, val initialAmount: Double, val purchasePrice: Double) : Investment {

    override fun getCurrentValue(): Double {
        return purchasePrice + Random.nextInt(-10..+10)
    }

    override fun getYearlyInterest(): Double {
        println("Eita... Tenho juros não :p")
        return 0.0
    }

    override fun getWithdrawalAmount(): Double {
        return getCurrentValue() * initialAmount
    }

    override fun getAssetName(): String {
        return asset
    }
}

class BondInvestment(val bondName: String, val price: Double, val prefixedRate: Double) :
    Investment {

    override fun getCurrentValue(): Double {
        return price + Random.nextInt(-5..+5)
    }

    override fun getYearlyInterest(): Double {
        return prefixedRate
    }

    override fun getWithdrawalAmount(): Double {
        println("Eita... Tenho valor de saque não :p")
        return 0.0
    }

    override fun getAssetName(): String {
        return bondName
    }
}

