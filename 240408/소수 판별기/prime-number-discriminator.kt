import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    if((1..n).count { n % it == 0 } == 2) {
        print("P")
    } else {
        print("C")
    }
}