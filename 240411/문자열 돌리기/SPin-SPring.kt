import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var str = sc.next()

    repeat(str.length + 1) {
        println(str)

        str = str.last() + str.slice(0..str.length - 2)
    }
}