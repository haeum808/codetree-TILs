import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val str = sc.next()
    var result = 0

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                if (str[i] == 'C' && str[j] == 'O' && str[k] == 'W') result++
            }
        }
    }

    print(result)
}