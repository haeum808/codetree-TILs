import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(calculate(n))
}

fun calculate(n: Int): Int {
    if (n < 10) {
        return n * n
    }

    return (n % 10) * (n % 10) + calculate(n / 10)
}