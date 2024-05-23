import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val hashMap = hashMapOf<Int, Int>()

    repeat(n) {
        val command = sc.next()

        when (command) {
            "add" -> { hashMap[sc.nextInt()] = sc.nextInt() }
            "find" -> {
                val key = sc.nextInt()
                if (hashMap.containsKey(key)) {
                    println(hashMap[key])
                } else {
                    println("None")
                }
            }
            "remove" -> { hashMap.remove(sc.nextInt()) }
        }
    }
}