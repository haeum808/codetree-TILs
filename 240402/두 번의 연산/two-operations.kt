import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()

    if (a % 2 != 0) a += 3
    if (a % 3 == 0) a /= 3

    print(a)
}