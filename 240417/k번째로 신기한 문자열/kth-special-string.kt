import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val k = sc.nextInt()
    val t = sc.next()
    val strs = Array(n) { sc.next() }

    print(strs.filter { it.startsWith(t) }.sorted()[k - 1])
}