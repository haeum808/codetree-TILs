import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var curX = 0
    val arr = IntArray(2001)

    repeat(n) {
        val x = sc.nextInt()
        val direction = sc.next()

        if (direction == "L") {
            ((curX - x + 1000)..(curX + 1000 - 1)).forEach {
                arr[it]++
            }
            curX -= x
        } else {
            ((curX + 1000)..(curX + x + 1000 - 1)).forEach {
                arr[it]++
            }
            curX += x
        }
    }

    print(arr.count { it >= 2 })
}