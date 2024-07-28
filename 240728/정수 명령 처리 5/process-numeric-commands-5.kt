import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val v = ArrayList<Int>()

    repeat(n) {
        val input = sc.next()

        when(input) {
            "push_back" -> {
                v.add(sc.nextInt())
            }
            "pop_back" -> {
                v.removeAt(v.size - 1)
            }
            "size" -> {
                println("${v.size}")
            }
            "get" -> {
                println("${v[sc.nextInt() - 1]}")
            }
        }
    }
}