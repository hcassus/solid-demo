package soliddemo.isp.deps.post

interface Investment {
    fun getCurrentValue(): Double
}

interface NamedAsset {
    fun getAssetName(): String // Bond + Stock
}

interface EarningInvestment {
    fun getYearlyInterest(): Double // Savings + Bond
}

interface LiquidableInvestment {
    fun getWithdrawalAmount(): Double // Stock + Savings
}
