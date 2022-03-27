package problems

// https://projecteuler.net/problem=1
// ans = 233168
/**
 * 3の倍数 + 5の倍数 - 15の倍数
 * **/
fun main(args: Array<String>){
  val plus = mutableListOf<Long>()
  val minus = mutableListOf<Long>()
  for (i in (1..999).map { it.toLong() }){
    if(i % 3L == 0L) plus.add(i)
    if(i % 5L == 0L) plus.add(i)
    if(i % 3L == 0L && i % 5L == 0L) minus.add(i)
  }
  val ans = plus.sum() - minus.sum()
  println(ans)
}