import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val gender = sc.nextInt()
    val age = sc.nextInt()

    if (gender == 0) {
        if (age >= 19) {
            print("MAN")
        } else {
            print("BOY")
        }
    } else if (gender == 1) {
        if (age >= 19) {
            print("WOMAN")
        } else {
            print("GIRL")
        }
    }
}