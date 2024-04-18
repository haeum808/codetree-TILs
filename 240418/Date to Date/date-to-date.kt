import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val m1 = sc.nextInt()
    val d1 = sc.nextInt()
    val m2 = sc.nextInt()
    val d2 = sc.nextInt()

    val result1 = (1..m1).map { calculateMonthOfDay(it) }.sum() + d1
    val result2 = (1..m2).map { calculateMonthOfDay(it) }.sum() + d2
    
    print(result2 - result1)
}

fun calculateMonthOfDay(n: Int): Int {
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