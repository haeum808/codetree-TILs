import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next() 
    val b = sc.next()

    print(a.filter { it.isDigit() }.toInt() + b.filter { it.isDigit() }.toInt())
}