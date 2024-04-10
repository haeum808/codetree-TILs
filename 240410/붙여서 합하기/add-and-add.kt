import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()
    val b = sc.next()

    print("$a$b".toInt() + "$b$a".toInt())
}