import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val n = sc.next()

    var decimal = 0
    var result = ""

    for (value in n) {
        decimal = decimal * a + "$value".toInt()
    }

    while(true) {
        result += decimal % b

        if (decimal < b) {
            break
        }

        decimal /= b
    }

    print(result.reversed())
}