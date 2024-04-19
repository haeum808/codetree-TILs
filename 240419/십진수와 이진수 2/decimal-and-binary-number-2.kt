import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val binary = sc.next()
    var decimal = 0
    var result = ""

    for(value in binary) {
        decimal = decimal * 2 + "$value".toInt()
    }

    decimal *= 17

    while(true) {
        result += decimal % 2

        if (decimal < 2) {
            break
        }

        decimal /= 2
    }

    print(result.reversed())
}