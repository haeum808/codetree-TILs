import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(calculate(n))
}

fun calculate(n: Int): Int {
    if (n == 1) {
        return 1
    }
    if (n == 2) {
        return 2
    }

    return calculate(n / 3) + calculate(n - 1)
}