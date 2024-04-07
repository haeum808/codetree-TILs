import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b, c) = sc.nextLine().trim().split(" ").map { it.toInt() }

    if ((a..b).any { c % it == 0 }) {
        print("YES")
    } else {
        print("NO")
    }
}