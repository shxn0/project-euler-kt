package tips

import java.math.BigDecimal
import kotlin.math.roundToLong
import kotlin.math.sqrt

/**
 * 素数クラス
 * 1は素数に入らない
 *
 */
class PrimeNumber {

  fun isPrime(n: Long): Boolean {
    if (n <= 1) return false
    for (i in 2..n) {
      if (i * i > n) break //  nが入力値 iが割る数 ルートの数まで求めれば良いのでこの式でOK
      if (n % i == 0L) return false
    }
    return true
  }

}