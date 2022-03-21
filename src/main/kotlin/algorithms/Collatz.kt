package algorithms

/**
 * 計算していくと1に到達する数列をコラッツ数列と呼ぶ
 */
class Collatz(
  val num: Long
) {

  // 奇数の場合と偶数の場合の数値を算出する
  fun calculate(): Long {
    return if (num % 2L == 0L) {
      num / 2
    } else {
      num * 3 + 1
    }
  }

  // 答えが1になるまで計算を実行してコラッツ数列を返す
  fun exec(): List<Long> {
    var ans: Long = num  // プロパティに渡された初期値を最初のansとして代入
    val czList = mutableListOf(num) // 初期値を入れて数列を格納するリストを作成

    while (ans != 1L) {
      ans = Collatz(ans).calculate()
      czList.add(ans)
    }
    return czList
  }

}