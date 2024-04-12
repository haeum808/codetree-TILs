import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in 1..n) {
        if (i % 2 == 0) {
            for (j in n downTo 1) {
                print("$j")
            }
        } else {
            for (j in 1..n) {
                print("$j")
            }
        }
        println()
    }   
}