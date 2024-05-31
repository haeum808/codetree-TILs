import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var result = 0
    val n = sc.nextInt()
    val k = sc.nextLong()

    val hashMap: HashMap<Long, Int> = hashMapOf()

    repeat(n) {
        val num = sc.nextLong()
        hashMap[num] = hashMap.getOrDefault(num, 0) + 1
    }

    for (i in hashMap.keys) {
        for (j in hashMap.keys) {
            if (i + j == k) {
                result += if (hashMap[i] == 1 && hashMap[j] == 1) {
                    1
                } else {
                    hashMap[i]?.times(hashMap[j]!! - 1) ?: return
                }
            }
        }
    }

    print(result / 2)
}