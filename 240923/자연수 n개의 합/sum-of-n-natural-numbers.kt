fun main() {
    val s = readln().toLong()
    var left = 1
    var right = s
    var max = s + 1

    while (left <= right) {
        val mid = (left + right) / 2

        if (mid * (mid + 1) / 2 <= s) {
            left += 1
            max = minOf(mid, max)
        } else {
            right -= 1
        }
    }

    print(max)
}