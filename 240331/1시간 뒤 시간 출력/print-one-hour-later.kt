import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    sc.useDelimiter(":")
    val h = sc.nextInt()
    val m = sc.nextInt()

    print("${h + 1}:$m")
}