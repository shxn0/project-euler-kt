package utils

import java.math.BigDecimal

/**
 * 自身が0と等しいかを返す
 */
fun BigDecimal.isZero(): Boolean = this.signum() == 0

/**
 * 自身が0より大きいかを返す
 */
fun BigDecimal.isPositive(): Boolean = this.signum() > 0

/**
 * 自身が0より小さいかを返す
 */
fun BigDecimal.isNegative(): Boolean = this.signum() < 0

/**
 * 含まれるBigDecimalの総和を返す。要素数が0の場合は0を返す
 *
 * ```kotlin
 * val list = listOf(BigDecimal("0.1"), BigDecimal("0.2"))
 * val total = list.sum() // #=> 0.3
 * ```
 */
fun Iterable<BigDecimal>.sum(): BigDecimal {
  var s = BigDecimal.ZERO
  this.forEach { s += it }
  return s
}


object BigDecimalUtil{
  /**
   * 2つのBigDecimalが等しいかどうかを返す。
   * BigDecimalにデフォルトの == や equals とは異なり scale が同一であるかの比較は行わない。
   */
  fun isSame(x: BigDecimal, y: BigDecimal): Boolean = x.compareTo(y) == 0
}
