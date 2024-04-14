import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n1 = sc.nextInt()
    val n2 = sc.nextInt()
    sc.nextLine()
    val list1 = sc.nextLine().trim().split(" ")
    val list2 = sc.nextLine().trim().split(" ")

    print(partialSequence(list1, list2))
}

fun partialSequence(list1: List<String>, list2: List<String>): String {
    return if (list1.joinToString("").contains(list2.joinToString(""))) {
        "Yes"
    } else {
        "No"
    }
}