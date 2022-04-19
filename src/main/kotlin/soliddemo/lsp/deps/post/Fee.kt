package soliddemo.lsp.deps.post

import soliddemo.lsp.deps.domain.Fee

data class CourseMaterialFee(override val value: Double) : Fee(value)
data class EnrollmentFee(override val value: Double) : Fee(value)
