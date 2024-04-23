import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val dx = mapOf('W' to -1, 'S' to 0, 'N' to 0, 'E' to 1)
    val dy = mapOf('W' to 0, 'S' to -1, 'N' to 1, 'E' to 0)

    var nx = 0
    var ny = 0

    repeat(n) {
        val direction = sc.next()[0]
        val distance = sc.nextInt()

        nx += dx[direction]!! * distance
        ny += dy[direction]!! * distance
    }

    print("$nx $ny")
}