import kotlin.math.pow

fun Int.power(degree: Int): Int {
    // it could be done with repeat block too, but I think this solution is cleaner
    return this.toDouble().pow(degree).toInt()
}
fun main() {
    println(5.power(3))
}