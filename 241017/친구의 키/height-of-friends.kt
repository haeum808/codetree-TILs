import java.util.*

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    
    val edges = Array(n + 1) { ArrayList<Int>() }
    val isVisited = BooleanArray(n + 1)
    val stack = Stack<Int>()

    fun dfs(x: Int) {
        for(i in 0 until edges[x].size) {
            val y = edges[x][i]

            if (isVisited[y].not()) {
                isVisited[y] = true
                dfs(y)
            }
        }

        stack.push(x)
    }

    repeat(m) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }

        edges[x].add(y)
    }

    for(i in 1 until n) {
        if(isVisited[i].not()) {
            isVisited[i] = true
            dfs(i)
        }
    }

    while(stack.isNotEmpty()) {
        print("${stack.pop()} ")
    }
}