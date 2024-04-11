import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in 1 .. n) {
        for (j in 1..n + 1 - i) {
            if (j == n + 1 - i) {
                println("$i * $j = ${i * j}")
            } else {
                print("$i * $j = ${i * j} / ")
            }
        }
    }
}