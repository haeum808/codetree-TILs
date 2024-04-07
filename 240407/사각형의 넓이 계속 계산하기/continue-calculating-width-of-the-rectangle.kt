import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    while(true) {
        val (a, b, c) = sc.nextLine().trim().split(" ")

        println("${a.toInt() * b.toInt()}")

        if (c == "C") { 
            break
        }
    }
}