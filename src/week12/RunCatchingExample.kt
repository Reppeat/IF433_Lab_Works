package week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result : Result<Int> = runCatching {
        "42x".toInt()
    }
    val safeValue = result.getOrElse {-1}
    println("Safe value (getOrElse): $safeValue")

    val recovered = result.recover {0} .getOrNull()
    println("Recovered value: $recovered")
}