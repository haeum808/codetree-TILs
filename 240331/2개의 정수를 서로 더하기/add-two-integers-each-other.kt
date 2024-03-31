import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()
    var b = sc.nextInt()

    a += b
    b += a

    print("$a $b")
}