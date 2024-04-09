import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var total = 0

    val n = sc.nextInt()
    sc.nextLine()

    repeat(n) {
        val scores = sc.nextLine().trim().split(" ").map { it.toDouble() }.sum() / 4

        if (scores >= 60.0) {
            println("pass")
            total++
        } else {
            println("fail")
        }
    }
    println(total)
}