package problems

import algorithms.Euclid

// https://projecteuler.net/problem=3
fun main(args: Array<String>) {
  var primes = mutableListOf<Long>()
  val target = 13195L

  for (i in 1..target){
    if(isPrime(i)) primes.add(i)
  }
  println(primes)
}

fun isPrime(n: Long): Boolean {
  if(n <= 1) return false
  for (i in 2..n) {
    if (i * i > n) return true
    if(n % i == 0L) return false
  }
  return true
}