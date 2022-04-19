package soliddemo.isp.deps.pre

interface Investment {
    fun getCurrentValue() : Double // Savings + Stock
    fun getYearlyInterest() : Double // Savings + Bond
    fun getWithdrawalAmount() : Double // Stock + Savings
    fun getAssetName() : String // Bond + Stock
}
