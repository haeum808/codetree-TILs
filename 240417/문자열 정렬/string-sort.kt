import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val str = sc.next()

    print(str.toList().sorted().joinToString(""))
}