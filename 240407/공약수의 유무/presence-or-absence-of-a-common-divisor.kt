import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    if ((a..b).any { 1920 % it == 0 || 2880 % it == 0 }) {
        print(1)
    } else {
        print(0)
    }
}