import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val numbers = IntArray(n * 2) { sc.nextInt() }.sorted()

    print(numbers[n] + numbers[n - 1])
}