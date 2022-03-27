package tips

// 真ん中の文字列を抽出
class FindTheMiddleOf {

  fun of() {
    // 奇数の文字列
    val st = "ABCDEFGHIJKLMNOPQRSTYVWXY"
    val t = st.substring(1, st.length - 1)

    // 最終的に抽出したい字数を指定
    // 奇数を指定して字数が抽出されない場合は元の文字列が偶数なのでEXTRACT_NUMを奇数に変更する
    val EXTRACT_NUM = 3

    var ans = ""
    for (i in 1 until (st.length / 2)) {
      ans = st.substring(i, st.length - i)
      println(ans)
      if (ans.length == EXTRACT_NUM) break
    }
    //println(ans)
  }
}
