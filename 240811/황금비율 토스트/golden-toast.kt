import java.util.LinkedList

fun main() {
    val l: LinkedList<Char> = LinkedList()
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val encry = readLine()!!

    for (i in encry.indices) {
        l.add(encry[i])
    }

    var iterator = l.listIterator(encry.length)

    repeat(m) {
        val input = readLine()!!

        when (input[0]) {
            'L' -> {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                }
            }

            'R' -> {
                if (iterator.hasNext()) {
                    iterator.next()
                }
            }

            'D' -> {
                if (iterator.hasNext()) {
                    iterator.next()
                    iterator.remove()
                }
            }

            'P' -> {
                iterator.add(input[2])
            }
        }
    }

    iterator = l.listIterator()

    while (iterator.hasNext()) {
        print("${iterator.next()}")
    }
}