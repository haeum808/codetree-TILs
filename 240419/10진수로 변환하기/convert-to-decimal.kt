import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val number = sc.next()
    var result = 0

    for (value in number) {
        result = result * 2 + "$value".toInt()
    }

    print(result)
}