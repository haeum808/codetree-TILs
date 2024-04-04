import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    for (i in b downTo a) {
        print("$i ")
    }
}