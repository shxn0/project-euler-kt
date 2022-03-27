package problems

import algorithms.Euclid

// https://projecteuler.net/problem=3
fun main(args: Array<String>) {
  val target = 600851475143L

  fun factorize(m: Long): MutableList<Long>{
    var n = m
    val factors = mutableListOf<Long>()

    for (i in 2L..n){
      if(i * i > n) break
      if(n % i == 0L){
        factors.add(i)
        while (n % i == 0L) n /= i
      }
    }
    if(n > 1) factors.add(n)
    return factors
  }

  val ans = factorize(target)
  println(ans)
}
