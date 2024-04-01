import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val temp = sc.nextInt()

    if (temp < 0) println("ice")
    else if (temp >= 100) println("vapor")
    else println("water")
}