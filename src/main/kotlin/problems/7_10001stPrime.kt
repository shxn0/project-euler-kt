package problems

// https://projecteuler.net/problem=7
// 104743
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

  for(i in 1..999999L){
    if(primes.size >= 10001L) break
    if(isPrime(i)){
      primes.add(i)
    }
  }
  println(primes.size)
  println(primes)
  println(primes.takeLast(1))

}