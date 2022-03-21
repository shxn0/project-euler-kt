package tips

import java.math.BigDecimal

/**
 * 自然数クラス（正の数）
 * 自然数とは0より大きな整数
 *
 * @property value
 */
class PositiveNumber(
  private val value: BigDecimal
) {

  /**
   * 自然数を桁毎に分解してListで返す
   * 1234 → [1, 2, 3, 4, 5]
   */
  fun divide(): List<BigDecimal> =
    this.value.toString()
      .split("").drop(1).dropLast(1)
      .map { it.toBigDecimal() }

}