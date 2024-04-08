import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var str = ""

    repeat(n) {
        str += sc.next()
    }

    val numbers = str.chunked(5)

    for(number in numbers) {
        println(number)
    }
}