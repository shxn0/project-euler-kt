package tips

import java.math.BigDecimal

/**
 * 三角数
 * 第n項の三角数は n（n＋1）÷2
 *
 */
class TripleNumber {

  fun exec(n: Long): Long {
//    return n * (n + BigDecimal.ONE) / BigDecimal(2)
    return n * (n + 1L) / 2L
  }
}