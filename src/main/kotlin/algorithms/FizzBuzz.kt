package algorithms

/**
 * FizzBuzz あってるけど見直す
 *
 * @param n 検査する数字
 * @return
 */
class FizzBuzz {

  /**
   * FizzBuzzを実行
   *
   * @param n 計算対象の数字
   */
  fun fizzBuzz(n: Long) {
    if (isThreeFold(n) && isFiveFold(n)) return println("Fizz Buzz")
    if (isThreeFold(n)) return println("Fizz")
    if (isFiveFold(n)) return println("Buzz")
    println(n)
  }

  private fun isThreeFold(n: Long): Boolean = n % 3 == 0L
  private fun isFiveFold(n: Long): Boolean = n % 5 == 0L
}