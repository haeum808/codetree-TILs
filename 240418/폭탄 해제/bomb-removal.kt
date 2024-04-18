import java.util.Scanner

class Bomb(
    val code: String,
    val color: String,
    val second: Int
)
fun main() {
    val sc = Scanner(System.`in`)

    val code = sc.next()
    val color = sc.next()
    val second = sc.nextInt()

    Bomb(code, color, second).let {
        println("code : $code")
        println("color : $color")
        println("second : $second")
    }
}