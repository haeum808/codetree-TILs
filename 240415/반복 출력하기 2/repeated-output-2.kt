import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    printHelloWorld(n)
}

fun printHelloWorld(n: Int) {
    if (n == 0) return

    printHelloWorld(n - 1)
    println("HelloWorld")
}