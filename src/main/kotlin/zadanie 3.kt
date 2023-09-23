fun main() {
    println("Введите натуральное число в десятичной системе:")
    val decimalNumber = readLine()?.toIntOrNull()

    if (decimalNumber != null && decimalNumber >= 0) {
        val binaryNumber = decimalToBinary(decimalNumber)
        println("В двоичной системе: $binaryNumber")
    } else {
        println("Некорректный ввод. Пожалуйста, введите натуральное число.")
    }
}

fun decimalToBinary(decimalNumber: Int): String {
    return Integer.toBinaryString(decimalNumber)
}
