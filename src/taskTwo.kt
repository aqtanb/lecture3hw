fun Int.power(degree: Int, block: (Int) -> Unit) {
    val result = this.power(degree)
    block(result)
}
fun main() {
    5.power(3) { result ->
        println("$result")
    }
}