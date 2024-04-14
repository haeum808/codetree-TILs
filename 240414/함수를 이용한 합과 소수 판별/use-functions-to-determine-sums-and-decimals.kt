import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    var cnt = 0
    
    for (i in a..b) {
        if (magicNumber(i)) cnt++
    }

    print(cnt)
}

fun magicNumber(num: Int): Boolean {
    if (num == 1) return false

    for (i in 2..num - 1) {
        if (num % i == 0) return false
    }

    return "$num".map { it.toInt() }.sum() % 2 == 0
}