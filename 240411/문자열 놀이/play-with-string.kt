import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val s = sc.next().toCharArray()
    val q = sc.nextInt()

    repeat(q) {
        val num = sc.nextInt()
        val a = sc.next()
        val b = sc.next()

        if (num == 1) {
            val temp = s["$a".toInt() - 1]
            s["$a".toInt() - 1] = s["$b".toInt() - 1]
            s["$b".toInt() - 1] = temp
        } else {
            for (index in s.indices) {
                if (s[index] == a[0]) {
                    s[index] = b[0]
                }
            }
        }
        println(s.joinToString(""))
    }

}