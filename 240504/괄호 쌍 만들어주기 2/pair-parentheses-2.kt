import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.next()
    var result = 0

    for (i in 0 until input.length - 1) {
        for (j in i + 2 until input.length - 1) {
            if (input[i] == '(' && input[i + 1] == '(' && input[j] == ')' && input[j + 1] == ')') {
                result++
            }
        }
    }

    print(result)
}