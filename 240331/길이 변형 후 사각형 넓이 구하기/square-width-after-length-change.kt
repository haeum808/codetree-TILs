import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()

    a += 8
    b *= 3

    println(a)
    println(b)
    println(a * b)
}