import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    sc.useDelimiter("-")

    val front = sc.nextInt()
    val back = sc.nextInt()
    print("$front$back")
}