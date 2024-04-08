import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine()
    val b = sc.nextLine()

    if ("$a$b" == "$b$a") {
        print("true")
    } else {
        print("false")
    }
}