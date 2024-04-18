import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val m1 = sc.nextInt()
    val d1 = sc.nextInt()
    val m2 = sc.nextInt()
    val d2 = sc.nextInt()
    val a = sc.next()

    var result1 = (1..m1 - 1).map { monthToDay(it) }.sum() + d1
    val result2 = (1..m2 - 1).map { monthToDay(it) }.sum() + d2

    when (a) {
        "Mon" -> result1 += 0
        "Tue" -> result1 += 1
        "Wed" -> result1 += 2
        "Thu" -> result1 += 3
        "Fri" -> result1 += 4
        "Sat" -> result1 += 5
        else -> result1 += 6
    }

    print((result2 - result1) / 7 + 1)
}

fun monthToDay(n: Int): Int {
    return when(n) {
        1 -> 31
        2 -> 29
        3 -> 31
        4 -> 30
        5 -> 31
        6 -> 30
        7 -> 31
        8 -> 31
        9 -> 30
        10 -> 31
        11 -> 30
        else -> 31
    }
}