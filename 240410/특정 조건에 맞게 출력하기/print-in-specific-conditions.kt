import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val numbers = sc.nextLine().trim().split(" ").map { it.toInt() }

    for (number in numbers) {
        if (number == 0) break

        if (number % 2 == 0) {
            print("${number / 2} ")
        } else {
            print("${number + 3} ")
        }
    }    
}