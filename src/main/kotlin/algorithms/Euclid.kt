package algorithms

/**
 * ユークリッドの互除法
 *
 */

class Euclid {

  /**
   * 最大公約数を求める
   */
  fun gcd(a: Long, b: Long): Long {

    var a = a
    var b = b
    var r = a % b

    while (r != 0L) {
      a = b
      b = r
      r = a % b
    }
    return b
  }


  /**
   * 最小公倍数を求める
   */
  fun lcm(a: Long, b: Long): Long {
    return a / gcd(a, b) * b
  }

}