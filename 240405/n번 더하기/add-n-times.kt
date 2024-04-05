import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var (a, n) = sc.nextLine().trim().split(" ").map { it.toInt() }

    repeat(n) {
        a += n
        println(a)
    }
}