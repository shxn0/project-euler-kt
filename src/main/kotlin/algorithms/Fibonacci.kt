package algorithms

import java.math.BigDecimal

/**
 * フィボナッチ数列 OK
 * [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
 *
 */
class Fibonacci {

  /**
   * フィボナッチ数列の「最大値(max)」を指定して数列を返す
   *
   * @param max 最大値
   * @return 数列
   */
  fun fibByMaxNum(max: Long): MutableList<BigDecimal> {
    val fibList = mutableListOf<BigDecimal>()

    var f1 = BigDecimal.ONE
    var f2 = BigDecimal(2)

//    val max: Long = 4000000  // 数列の項の最大値を指定

    while (f2 <= max.toBigDecimal()) {
      if (f1 == BigDecimal.ONE) fibList.add(BigDecimal.ONE) // 数列の最初は個別に入れる
      if (f2 == BigDecimal(2)) fibList.add(BigDecimal.ONE)

      val tmp = f1 + f2 // f3になる数字を計算
      f1 = f2           // ずらす
      f2 = tmp          // 計算したものが次のf2になる
      fibList.add(f1)
    }
    return fibList
  }

  /**
   * フィボナッチ数列の「数列の長さ」を指定して数列を返す
   * [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]  10桁
   *
   * @param len 数列の長さを指定
   * @return 数列
   */
  fun fibByLength(len: Long): MutableList<BigDecimal> {
    var f1 = BigDecimal.ONE
    var f2 = BigDecimal(2)
    val fibList = mutableListOf<BigDecimal>(f1, f2)

    var i = 1L
    while(fibList.size < len) {
      val tmp = f1 + f2
      f1 = f2
      f2 = tmp
      fibList.add(f1)
      i += 1
    }
    return fibList
  }

  /**
   * フィボナッチ数列の「数の桁数」を指定してそこまでの数列を返す
   *
   * @param digit 数列の桁数を指定 (3桁なら3を入れる)
   * @return 数列
   */
  fun fibByDigits(digit: Long): MutableList<BigDecimal> {
    var f1 = BigDecimal.ONE
    var f2 = BigDecimal(2)
    val fibList = mutableListOf<BigDecimal>(f1, f2)

    var i = 1L
    while(f1.toString().length < digit) { // ←は 桁数を指定
      val tmp = f1 + f2
      f1 = f2
      f2 = tmp
      fibList.add(f1)
      i += 1
    }
    return fibList
  }



}