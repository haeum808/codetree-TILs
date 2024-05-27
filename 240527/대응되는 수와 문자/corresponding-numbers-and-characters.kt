import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val stringToInt: HashMap<String, String> = hashMapOf()
    val intToString: HashMap<String, String> = hashMapOf()

    val n = sc.nextInt()
    val m = sc.nextInt()

    repeat(n) { number ->
        val str = sc.next()

        stringToInt[str] = "${number + 1}"
        intToString["${number + 1}"] = str
    }

    repeat(m) {
        val next = sc.next()

        if (stringToInt.containsKey(next)) {
            println(stringToInt[next])
        } else {
            println(intToString[next])
        }
    }
}