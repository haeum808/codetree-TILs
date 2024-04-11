import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val str = sc.next()

    print(str[0] + str.substring(2, str.length - 2) + str.last())
}