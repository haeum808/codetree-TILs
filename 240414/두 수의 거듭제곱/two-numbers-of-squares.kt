import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    print(power(a, b))
}

fun power(a: Int, b: Int): Int {
    return (1..b - 1).fold(a) { acc, value -> acc * a }
}