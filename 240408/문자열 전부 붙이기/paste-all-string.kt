import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var str = ""

    repeat(n) {
        str += sc.nextLine()
    }

    print(str)
}