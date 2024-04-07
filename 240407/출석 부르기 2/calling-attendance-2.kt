import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    while(true) {
        val number = sc.nextInt()

        if (number == 1) {
            println("John")
        } else if (number == 2) {
            println("Tom")
        } else if (number == 3) {
            println("Paul")
        } else if (number == 4) {
            println("Sam")
        } else {
                print("Vacancy") 
                break 
        }
    }
}