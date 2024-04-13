import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val y = sc.nextInt()

    if (isLeapYear(y)) {
        print("true")
    } else {
        print("false")
    }
}

fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0) && !(year % 100 == 0 && year % 400 != 0)
}