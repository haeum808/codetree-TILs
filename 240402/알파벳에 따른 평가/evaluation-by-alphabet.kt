import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val alphabet = sc.next()[0]

    if (alphabet == 'S') {
        println("Superior")
    } else if (alphabet == 'A') {
        println("Excellent")
    } else if (alphabet == 'B') {
        println("Good")
    } else if (alphabet == 'C') {
        println("Usually")
    } else if (alphabet == 'D') {
        println("Effort")
    } else {
        println("Failure")
    }
}