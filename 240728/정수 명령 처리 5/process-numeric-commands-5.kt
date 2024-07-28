import java.util.StringTokenizer

fun main() {
    val n = readLine()!!.toInt()
    val v = ArrayList<Int>()

    repeat(n) {
        val input = StringTokenizer(readLine()!!)

        when(input.nextToken()) {
            "push_back" -> {
                v.add(input.nextToken().toInt())
            }
            "pop_back" -> {
                v.removeAt(v.size - 1)
            }
            "size" -> {
                println("${v.size}")
            }
            "get" -> {
                println("${v[input.nextToken().toInt() - 1]}")
            }
        }
    }
}