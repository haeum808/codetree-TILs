import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val str = sc.next()

    print(str[0] + "a" + str.slice(2..str.length - 3) + "a" + str.last())
}