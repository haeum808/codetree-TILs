import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.nextLine()
    val sb = StringBuilder()

    if (input.length == 1) {
        print(2)
        print("${input}1")
    } else {
        var count = 1
        for (i in 1..input.length - 1) {
            if (input[i] == input[i - 1]) {
                count++
            } else {
                if (i == 1) sb.append("${input[i - 1]}1")
                else {sb.append("${input[i - 1]}$count")}
                count = 1
            }
        }
        sb.append("${input.last()}$count")

        println(sb.length)
        println(sb)
    }
}