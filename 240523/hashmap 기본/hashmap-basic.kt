import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val hashMap = hashMapOf<Int, Int>()

    repeat(n) {
        val command = sc.next()

        when (command) {
            "add" -> {
                val key = sc.nextInt()
                val value = sc.nextInt()
                hashMap[key] = value
            }

            "find" -> {
                val key = sc.nextInt()
                if (hashMap.containsKey(key)) {
                    println(hashMap[key])
                } else {
                    println("None")
                }
            }

            "remove" -> {
                val key = sc.nextInt()
                hashMap.remove(key)
            }
        }
    }
}