import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var i = 3

    while(i <= n) {
        print("$i ")
        i += 3
    }
}