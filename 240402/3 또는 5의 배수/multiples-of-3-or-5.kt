import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()

    if (a % 3 == 0) {
        println("YES")
    } else {
        println("NO")
    }

    if (a % 5 == 0) {
        println("YES")
    } else {
        println("NO")
    }
}