import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var i = 1

    while(i != n + 1) {
        print("${i++} ")
    }
}