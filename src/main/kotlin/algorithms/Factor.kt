package algorithms

/**
 * 素因数
 * 数学における自然数の約数になる素数のことである
 *
 */
class Factor {

  // 素因数のリストを返却する
  fun factor(m: Long): List<Long> {
    var n = m
    val res = mutableListOf<Long>()

    for (i in 2L..m) {
      if (i * i > n) break // 平方根以上は求める必要ない
      if (n % i == 0L) { // 余りがないので素因数とわかる
        res.add(i)
        while (n % i == 0L) n /= i // 割り続けられるまで割る
      }
    }
    if (n > 1) res.add(n) // 最後の素因数を確認する
    return res
  }

}