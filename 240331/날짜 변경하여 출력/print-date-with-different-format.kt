import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    sc.useDelimiter("\\.")

    val yyyy = sc.nextInt()
    val mm = sc.nextInt()
    val dd = sc.nextInt()

    print("${mm}-${dd}-${yyyy}")
}