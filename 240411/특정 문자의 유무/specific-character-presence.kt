import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.next()

    if (input.contains("ee")) {
        print("Yes ")
    } else {
        print("No ")
    }

    if (input.contains("ab")) {
        print("Yes ")
    } else {
        print("No ")
    }
}