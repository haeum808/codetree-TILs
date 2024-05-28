import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val hashMap: HashMap<Int, Int> = hashMapOf()

    repeat(n) {
        val str = sc.next().map { it.toInt() }.sum()

        hashMap[str] = hashMap.getOrDefault(str, 0) + 1
    }

    println(hashMap.values.max())
}