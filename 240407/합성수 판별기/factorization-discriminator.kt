import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    if ((2..n - 1).any { n % it == 0 }) {
        print("C")
    } else {
        print("N")
    }
}