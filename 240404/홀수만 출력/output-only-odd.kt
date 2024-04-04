import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    for (i in a.. b) {
        if (i % 2 != 0) {
            print("$i ")
        }
    }
}