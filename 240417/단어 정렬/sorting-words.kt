import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val strs = Array(n) { sc.next() }.sorted()

    print(strs.joinToString("\n"))
}