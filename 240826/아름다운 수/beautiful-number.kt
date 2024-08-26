var n = 0
val numbers = mutableListOf<Int>()
var count = 0

fun main() {
    n = readLine()!!.toInt()
    choose(0)
    print(count)
}

fun check() {
    var i = 0

    while (i < n) {
        if (i + numbers[i] - 1 >= n) return

        for (j in i until i + numbers[i]) {
            if (numbers[j] != numbers[i]) return
        }

        i += numbers[i]
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