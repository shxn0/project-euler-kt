package algorithms

class Grid {

  /**
   * 4つの数字を順にかけていき、一番大きい数字を返す
   *
   * @param list 横列のリスト(1行ずつ)
   * @return 最大の積
   */
  fun calculate(list: MutableList<Long>): Long {
    var ans = 1L
    val digit = 20  // 格子の桁数
    val target = 4  // 連続する数字の数

    for ((index, n) in list.withIndex()) {
      if (index == 20 - 4) break
      val res = list.subList(index, index + 4)
        .reduce { acc, l -> acc * l }
      if (res > ans) {
        ans = res
      }
    }
    return ans
  }


  /**
   * 一次元のリストを渡して縦列の二次元配列を返却する
   *
   * @param digits 格子の桁数
   * @param list 一次元にしたリスト
   */
  fun generateVerticalList(list: MutableList<Long>): MutableList<MutableList<Long>> {

    // 縦配列のリスト準備
    val colList = mutableListOf<MutableList<Long>>()

    // 一列ずつずらしていくのを20回行う
    for (c in 0..19) {                  // 20桁の場合
      val li = mutableListOf<Long>()
      for (i in 0..399 step 20) {       // 縦配列を作成 (20*20=400の場合)
        li.add(list[i + c])             // ここでIndexは足す
      }
      colList.add(li)
    }
    return colList
  }

}