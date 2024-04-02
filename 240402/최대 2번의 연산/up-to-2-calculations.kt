import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()

    if (a % 2 == 0) a /= 2
    if (a % 2 != 0) a = (a + 1) / 2

    println(a)
}