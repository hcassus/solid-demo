package soliddemo.isp.deps.post

import java.time.LocalDate
import java.time.LocalDateTime.now
import java.time.temporal.ChronoUnit
import kotlin.math.pow
import kotlin.random.Random
import kotlin.random.nextInt

class SavingsInvestment(
    val amount: Double,
    val interest: Double,
    val depositDate: LocalDate
    ) : Investment, LiquidableInvestment, EarningInvestment {

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

}

class StockInvestment(
    val asset: String,
    val initialAmount: Double,
    val purchasePrice: Double
    ) : Investment, LiquidableInvestment, NamedAsset {

    override fun getCurrentValue(): Double {
        return purchasePrice + Random.nextInt(-10..+10)
    }

    override fun getWithdrawalAmount(): Double {
        return getCurrentValue() * initialAmount
    }

    override fun getAssetName(): String {
        return asset
    }
}

class BondInvestment(
    val bondName: String,
    val price: Double,
    val prefixedRate: Double
    ) : Investment, EarningInvestment, NamedAsset {

    override fun getCurrentValue(): Double {
        return price + Random.nextInt(-5..+5)
    }

    override fun getYearlyInterest(): Double {
        return prefixedRate
    }

    override fun getAssetName(): String {
        return bondName
    }
}

