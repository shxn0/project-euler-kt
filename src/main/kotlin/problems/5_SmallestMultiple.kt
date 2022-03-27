package problems

// https://projecteuler.net/problem=5
fun main(args: Array<String>) {

  // 最大公約数
  fun gcd(a: Long, b: Long): Long {
    var a = a
    var b = b
    var r = a % b
    while (r != 0L) {
      a = b
      b = r
      r = a % b
    }
    return b
  }

  // 最小公倍数
  fun clm(a: Long, b: Long): Long {
    return a / gcd(a, b) * b
  }

  val results = mutableListOf<Long>()

  var clm = 1L
  for (a in 1..20L) {
    clm = clm(a, clm)
    println(clm)
  }
}