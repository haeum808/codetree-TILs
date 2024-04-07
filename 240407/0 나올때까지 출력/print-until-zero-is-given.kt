import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    while(true) {
        val number = sc.nextInt()

        if (number == 0) break

        println(number)
    }
}