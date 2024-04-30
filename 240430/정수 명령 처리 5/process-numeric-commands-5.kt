import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr = mutableListOf<Int>()

    repeat(n) {
        val input = sc.next()

        when (input) {
            "push_back" -> {
                val number = sc.nextInt()
                arr.add(number)
             }
            "pop_back" -> {
                arr.removeAt(arr.size - 1)
            }
            "get" -> {
                val number = sc.nextInt()
                println(arr[number - 1])
            }
            else -> {
                println(arr.size)
            }
        }
    }
}