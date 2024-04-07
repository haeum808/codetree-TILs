import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    while(true) {
        val number = sc.nextInt()

        if(number == 25) {
            print("Good")
            break
        } else if (number > 25) {
            println("Lower")
        } else {
            println("Higher")
        }
    }
}