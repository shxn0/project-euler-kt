package problems

// https://projecteuler.net/problem=10
// 142913828922
fun main(args: Array<String>) {

  fun isPrime(n: Long): Boolean {
    if (n <= 1) return false
    for (i in 2L..n) {
      if (i * i > n) break
      if (n % i == 0L) return false
    }
    return true
  }

  val primes = mutableListOf<Long>()
  for (n in 2..2000000L) {
    if(isPrime(n)) primes.add(n)
  }

  println(primes)
  println(primes.sum())

}