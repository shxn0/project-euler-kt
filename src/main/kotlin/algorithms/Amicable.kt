package algorithms

/**
 * 友愛数
 *
 * 220 の自分自身を除いた約数は、1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 で、和は 284 となる。
 * 一方、284 の自分自身を除いた約数は、1, 2, 4, 71, 142 で、和は 220 である。
 *
 */
class Amicable {


  fun exec(n: Long): Pair<Long, Long>? {

    var a = (1..n).toList()
      .map { it }
      .filter { n % it == 0L }
      .dropLast(1)  // 自分自身を取り除く
      .sum()

    var b = (1..a).toList()
      .map { it }
      .filter { a % it == 0L }
      .dropLast(1)  // 自分自身を取り除く
      .sum()

    if(a == b) return null

    if (b == n) {
     return Pair(b, a)
    }
    return null
  }

}