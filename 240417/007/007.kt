import java.util.Scanner

data class Letter(
    val secretCode: String,
    val meetingPoint: String,
    val time: Int
)

fun main() {
    val sc = Scanner(System.`in`)

    val secretCode = sc.next()
    val meetingPoint = sc.next()
    val time = sc.nextInt()

    Letter(secretCode, meetingPoint, time).let {
        println("secret code : $secretCode")
        println("meeting point : $meetingPoint")
        print("time : $time")
    }
}