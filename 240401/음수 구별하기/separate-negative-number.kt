import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    println(n)
    if (n < 0) {
        println("minus")
    }
}