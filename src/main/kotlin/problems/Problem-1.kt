package problems

import algorithms.Euclid

// https://projecteuler.net/problem=1
/**
 * 3の倍数 + 5の倍数 - 15の倍数
 * **/
fun main(args: Array<String>){
  val plus = mutableListOf<Int>()
  val minus = mutableListOf<Int>()
  for (i in (1..999)){
    if(i % 3 == 0) plus.add(i)
    if(i % 5 == 0) plus.add(i)
    if(i % 3 == 0 && i % 5 == 0) minus.add(i)
  }
  val ans = plus.sum() - minus.sum()
  println(ans)
}