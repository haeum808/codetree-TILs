import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.nextLine().map { 
        if (it.isUpperCase()) {
            (it.toInt() + 32).toChar() 
        } else {
            (it.toInt() - 32).toChar()
        }
     }.joinToString("")

    print(input)
}