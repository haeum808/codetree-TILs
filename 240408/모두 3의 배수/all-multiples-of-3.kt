import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var isThree = true

    repeat(5) {
        val number = sc.nextInt()

        if (number % 3 != 0) isThree = false
    }

    if (isThree) print(1) else print(0)
}