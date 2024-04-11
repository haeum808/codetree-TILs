import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val str = sc.next()

    print(str.slice(1..str.length - 1) + str[0])
}