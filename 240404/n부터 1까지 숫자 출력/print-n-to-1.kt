import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()

    while (n >= 1) {
        print("${n--} ")
    }
}