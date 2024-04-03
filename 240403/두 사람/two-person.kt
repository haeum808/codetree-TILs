import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (age1, gender1) = sc.nextLine().split(" ")
    val (age2, gender2) = sc.nextLine().split(" ")

    if (age1 >= "19" && gender1 == "M" || age2 >= "19" && gender2 == "M") {
        print(1)
    } else {
        print(0)
    }
}