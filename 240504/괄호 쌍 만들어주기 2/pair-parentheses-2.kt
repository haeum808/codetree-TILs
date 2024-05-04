import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.next()
    var result = 0

    for (i in 0 until input.length) {
        for (j in i + 1 until input.length) {
            for (k in j + 1 until input.length) {
                for (l in k + 1 until input.length) {
                    if (input[i] == '(' && input[j] == '(' && i + 1 == j && k + 1 == l && input[k] == ')' && input[l] == ')') {
                        result++
                    }
                }
            }
        }
    }
    
    print(result)
}