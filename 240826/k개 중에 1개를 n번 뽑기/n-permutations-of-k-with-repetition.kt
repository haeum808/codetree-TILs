var k = 0
var n = 0
val numbers = ArrayList<Int>()

fun main() {
    val (inputK, inputN) = readLine()!!.split(" ").map { it.toInt() }
    k = inputK
    n = inputN

    choose(1)
}

fun print() {
    println(numbers.joinToString(" "))
}

fun choose(curNum: Int) {
    if (curNum == n + 1) {
        print()
        return
    }

    for (i in 1..k) {
        numbers.add(i)
        choose(curNum + 1)
        numbers.removeAt(numbers.size - 1)
    }
}