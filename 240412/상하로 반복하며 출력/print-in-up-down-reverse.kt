import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var odd = 1
    var even = n

    for (i in 1..n) {
        for (j in 1..n) {
            if (j % 2 == 0) {
                print("$even")
            } else {
                print("$odd")
            }
        }
        odd++
        even--
        println()
    }
}