import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val y = sc.nextInt()

    if (y % 4 == 0 && !(y % 100 == 0 && y % 400 != 0)) {
        print("true")
    } else {
        print("false")
    }
}