import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val number = sc.nextInt()

    if (number == 1) {
        println("John")
    } else if (number == 2) {
        println("Tom")
    } else if (number == 3) {
        println("Paul")
    } else {
        println("Vacancy")
    }
}