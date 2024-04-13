import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val sum = sumOfNumbers(n)

    print(sum / 10)
}

fun sumOfNumbers(n: Int): Int {
    return (1..n).sum()
}