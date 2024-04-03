import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    if ((n % 2 != 0 && n % 3 == 0) || (n % 2 == 0 && n % 5 == 0)) {
        print(true)
    } else {
        print(false)
    }
}