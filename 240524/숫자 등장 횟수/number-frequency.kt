import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val hashMap: HashMap<Int, Int> = hashMapOf()

    val n = sc.nextInt()
    val m = sc.nextInt()

    repeat(n) {
        val q = sc.nextInt()

        hashMap[q] = hashMap.getOrDefault(q, 0) + 1
    }

    repeat(m) {
        val k = sc.nextInt()

        print("${hashMap[k] ?: 0} ")
    }
}