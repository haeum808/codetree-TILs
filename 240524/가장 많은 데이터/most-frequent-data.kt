import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val hashMap: HashMap<String, Int> = hashMapOf()

    repeat(n) {
        val str = sc.next()

        hashMap[str] = hashMap.getOrDefault(str, 0) + 1
    }

    print(hashMap.values.max())
}