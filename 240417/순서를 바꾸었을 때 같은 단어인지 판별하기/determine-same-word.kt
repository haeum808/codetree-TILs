import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val str1 = sc.next()
    val str2 = sc.next()

    if (str1.toList().sorted() == str2.toList().sorted()) {
        print("Yes")
    } else {
        print("No")
    }
}