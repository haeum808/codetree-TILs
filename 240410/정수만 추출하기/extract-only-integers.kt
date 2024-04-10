import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next() 
    val b = sc.next()

    print(a.takeWhile { it.isDigit() }.toInt() + b.takeWhile { it.isDigit() }.toInt())
}