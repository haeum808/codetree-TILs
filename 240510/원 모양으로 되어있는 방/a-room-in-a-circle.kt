import java.util.Scanner
import kotlin.math.min
import java.util.Queue
import java.util.LinkedList

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val queue: Queue<Int> = LinkedList<Int>()

    repeat(n) {
        queue.offer(sc.nextInt())
    }
    var min = Int.MAX_VALUE

    for (i in 0 until n) {
        var sum = 0
        queue.offer(queue.poll())

        for (j in 1 until n) {
            val poll = queue.poll()

            sum += poll * j
            queue.offer(poll)
        }
        min = min(min, sum)

        queue.offer(queue.poll())
    }

    print(min)
}