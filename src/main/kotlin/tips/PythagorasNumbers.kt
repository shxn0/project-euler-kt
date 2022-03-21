package tips

/**
 * ピタゴラス数
 * 原始ピタゴラス数 primitive
 * （ピタゴラス数は定倍してもピタゴラスなので最大公約数が1のものを原始ピタゴラス数と呼ぶ）
 *
 * 正の整数 m,n (m > n) を用いて，
 *
 * a = m^2 - n^2,
 * b = 2mn,
 * c = m^2 + n^2
 *
 * とすると，(a,b,c)(a,b,c) はピタゴラス数になります。
 *
 */
class PythagorasNumbers {

  fun exec(m: Long, n: Long): Triple<Long, Long, Long> {
    val mm = m * m
    val nn = n * n
    return Triple(mm - nn, 2 * m * n, mm + nn)
  }

}