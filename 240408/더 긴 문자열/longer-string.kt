import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ")

    if (a.length > b.length) {
        print("$a ${a.length}")
    } else if (b.length > a.length) {
        print("$b ${b.length}")
    } else {
        print("same")
    }
}