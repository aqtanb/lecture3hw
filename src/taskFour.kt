sealed class DataType {
    data class DoubleType(val value: Double) : DataType()
    data object UnitType : DataType()
}

fun DataType.displayTypeInfo() {
    when (this) {
        is DataType.DoubleType -> println("это DoubleType со значением ${this.value}")
        is DataType.UnitType -> println("это Unit")
    }
}

fun main() {
    3.displayTypeInfo()
    "a".displayTypeInfo()
    true.displayTypeInfo()
    DataType.DoubleType(1.4).displayTypeInfo()
    DataType.UnitType.displayTypeInfo()
}