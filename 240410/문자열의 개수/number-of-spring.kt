import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var cnt = 0
    val sb = StringBuilder()

    while(true) {
        val input = sc.next()

        if (input == "0") break

        if (cnt % 2 == 0) sb.append("$input\n")

        cnt++
    }

    println(cnt)
    println(sb)
}