import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val char = sc.next()[0]

    repeat(8) {
        print(char)
    }
}