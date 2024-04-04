import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var a = 1

    repeat(5) {
        print("${n * a++} ")
    }
}