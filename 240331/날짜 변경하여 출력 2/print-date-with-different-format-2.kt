import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    sc.useDelimiter("-")

    val mm = sc.nextInt()
    val dd = sc.nextInt()
    val yyyy = sc.nextInt()

    print("${yyyy}.${mm}.${dd}")
}