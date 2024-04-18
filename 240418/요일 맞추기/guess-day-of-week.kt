import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val m1 = sc.nextInt()
    val d1 = sc.nextInt()
    val m2 = sc.nextInt()
    val d2 = sc.nextInt()

    val result1 = (1..m1 - 1).map { monthToDay(it) }.sum() + d1
    val result2 = (1..m2 - 1).map { monthToDay(it) }.sum() + d2
    
    when((result2 - result1) % 7) {
        0 -> print("Mon")
        -6, 1 -> print("Tue")
        -5, 2 -> print("Wed")
        -4, 3 -> print("Thu")
        -3, 4 -> print("Fri")
        -2, 5 -> print("Sat")
        -1, 6 -> print("Sun")
    }
}

fun monthToDay(n: Int): Int {
    return when(n) {
        1 -> 31
        2 -> 28
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