import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var char = 'A'

    for (i in n downTo 1) {
        repeat(n - i) {
            print("  ")
        }
        for (j in 1..i) {
            print("$char ")

            if (char == 'Z') {
                char = 'A'
            } else {
                char++
            }
        }
        println()
    }
}