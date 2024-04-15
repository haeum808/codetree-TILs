import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(sum(n))
}

fun sum(n: Int): Int {
    if (n == 1) {
        return 1
    }

    return n + sum(n - 1)
}