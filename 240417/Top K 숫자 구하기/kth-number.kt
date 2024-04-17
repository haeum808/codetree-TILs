import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val k = sc.nextInt()
    val numbers = IntArray(n) { sc.nextInt() }

    print(numbers.sorted()[k - 1])
}