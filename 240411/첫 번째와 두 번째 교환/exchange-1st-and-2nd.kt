import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val arr = sc.next().toCharArray()
    
    val target1 = arr[0]
    val target2 = arr[1]

    for(index in arr.indices) {
        if (arr[index] == target2) {
            arr[index] = target1
        } else if (arr[index] == target1) {
            arr[index] = target2
        }
    }

    print(arr.joinToString(""))
}