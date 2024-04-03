import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()

    if (a in 10..20) {
        print("yes")
    } else {
        print("no")
    }
}