import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    while(true) {
        val input = sc.next()

        if (input == "END") break

        println(input.reversed())
    }
}