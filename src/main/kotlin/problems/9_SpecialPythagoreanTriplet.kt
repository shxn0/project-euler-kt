package problems
// https://projecteuler.net/problem=9
// 31875000
fun main(args: Array<String>) {
  val triples = mutableListOf<Triple<Long, Long, Long>>()

  for (a in 1..1000L) {
    for (b in 1..1000L) {
      for (c in 1..1000L) {
        if (a * a + b * b == c * c) {
          if ((a + b + c) == 1000L) {
            println("$a, $b, $c")
            println(a * b * c)
          }
        }
      }
    }
  }
  println(triples)

}