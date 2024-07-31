import java.util.LinkedList
import java.util.StringTokenizer

fun main() {
    val l = LinkedList<Int>()

    val input = readLine()!!.toInt()

    repeat(input) {
        val st = StringTokenizer(readLine())

        when (st.nextToken()) {
            "push_front" -> {
                l.addFirst(st.nextToken().toInt())
            }

            "push_back" -> {
                l.addLast(st.nextToken().toInt())
            }

            "pop_front" -> {
                println("${l.pollFirst()}")
            }

            "pop_back" -> {
                println("${l.pollLast()}")
            }

            "size" -> {
                println("${l.size}")
            }

            "empty" -> {
                if (l.isEmpty()) {
                    println("1")
                } else {
                    println("0")
                }
            }

            "front" -> {
                println("${l.peekFirst()}")
            }

            "back" -> {
                println("${l.peekLast()}")
            }
        }
    }
}