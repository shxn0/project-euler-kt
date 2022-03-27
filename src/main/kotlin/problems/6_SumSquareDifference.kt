package problems

// https://projecteuler.net/problem=6
// 25164150
fun main(args: Array<String>) {
  var square = 0L
  var sum = 0L

  for (a in 1..100L) {
    square += a * a
    sum += a
  }
  println(square)
  println(sum * sum)
  println(sum * sum - square)
}