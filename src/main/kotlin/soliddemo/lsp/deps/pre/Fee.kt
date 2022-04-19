package soliddemo.lsp.deps.pre

import soliddemo.lsp.deps.domain.Fee

data class FixedFee(override val value: Double) : Fee(value)

data class PercentageFee(override val value: Double) : Fee(value)

data class CompositePercentageFee(override val value: Double, val months: Int) : Fee(value)
