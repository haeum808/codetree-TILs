import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.next()
    var result = 0

    for (i in 0 until input.length) {

        for (j in i + 1 until input.length) {
            if (input[i] == '(' && input[j] == ')') {
                result++
            }
        }
    }

    print(result)
}