import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    if (n == 4 || n == 6 || n == 9 || n == 11) {
        print(30)
    } else if (n == 2) {
        print(28)
    } else {
        print(31)
    }
}