import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    for (i in a downTo b) {
        if (i % 2 != 0) {
            print("$i ")
        }
    }
}