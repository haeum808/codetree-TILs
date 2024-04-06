import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var sum = 0
    var count = 0

    repeat(10) {
        val num = sc.nextInt()

        if (num in 0..200) {
            sum += num
            count += 1
        }
    }

    print("$sum ")
    print("%.1f".format(sum / count.toDouble()))
}