import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.nextLine().filter { it.isLetter() || it.isDigit() }.map { 
        if (it.isLetter() && it.isUpperCase()) {
            (it.toInt() + 32).toChar() 
        } else {
            it
        }
     }.joinToString("")

    print(input)
}