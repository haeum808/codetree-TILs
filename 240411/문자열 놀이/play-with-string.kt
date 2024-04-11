import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val s = sc.next().toCharArray()
    val q = sc.nextInt()

    repeat(q) {
        val num = sc.nextInt()
        val a = sc.next()[0]
        val b = sc.next()[0]

        if (num == 1) {
            val temp = s["$a".toInt() - 1]
            s["$a".toInt() - 1] = s["$b".toInt() - 1]
            s["$b".toInt() - 1] = temp
        } else {
            for (index in s.indices) {
                if (s[index] == a) {
                    s[index] = b
                }
            }
        }
        println(s.joinToString(""))
    }

}