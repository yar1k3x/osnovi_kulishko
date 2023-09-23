fun main() {
    println("Введите строку:")
    val inputString = readLine() ?: ""
    val charCountMap = inputString.groupingBy { it }.eachCount().toSortedMap()

    charCountMap.forEach { (char, count) ->
        println("$char - $count")
    }
}
