import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val str1 = sc.next()
    val str2 = sc.next()

    print(str1.slice(0..1) + str2.slice(2..str2.length - 1))
}