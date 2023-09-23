fun main() {
    println("Введите строку:")
    val inputString = readLine() ?: ""
    val compressedString = compressString(inputString)
    println(compressedString)
}

fun compressString(input: String): String {
    if (input.isEmpty()) {
        return ""
    }

    var compressed = ""
    var currentChar = input[0]
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {
            compressed += currentChar + if (count > 1) count.toString() else ""
            currentChar = input[i]
            count = 1
        }
    }

    compressed += currentChar + if (count > 1) count.toString() else ""

    return compressed
}
