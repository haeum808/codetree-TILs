var n = 0
val numbers = mutableListOf<Int>()
var count = 0

fun main() {
    n = readLine()!!.toInt()
    choose(0)
    println(count)
}

fun check() {
    var index = 0

    while (index < n) {
        when (numbers[index]) {
            1 -> index++
            2 -> if (index + 1 < n && numbers[index + 1] == 2) index += 2 else return
            3 -> if (index + 2 < n && numbers[index + 1] == 3 && numbers[index + 2] == 3) index += 3 else return
            4 -> if (index + 3 < n && numbers[index + 1] == 4 && numbers[index + 2] == 4 && numbers[index + 3] == 4) index += 4 else return
        }
    }

    count++
}

fun choose(curNum: Int) {
    if (curNum == n) {
        check()
        return
    }

    for (i in 1..4) {
        numbers.add(i)
        choose(curNum + 1)
        numbers.removeAt(numbers.size - 1)
    }
}