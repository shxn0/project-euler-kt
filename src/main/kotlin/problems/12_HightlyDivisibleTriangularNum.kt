package problems
// https://projecteuler.net/problem=12

/**
 * 三角数を求める公式
 *  t = n(n +1) / 2
 * **/
fun main(args: Array<String>) {
    val triangles = mutableListOf<Long>()
    for (i in 10000L..999999) {
        val a = i * (i + 1) / 2
        triangles.add(a)
    }

    for (t in triangles) {
        var cnt = 0
        if(t < 1) continue
        for (i in 1L..t) {
            if (t % i == 0L) cnt += 1
        }
        println("$t, $cnt")
        if(cnt > 500) break
    }
}