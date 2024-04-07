import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for (i in n downTo 1) {
        for (j in 1..i) {
            repeat(i) {
                print("*")
            }
            print(" ")
        }
        println()
    }
}