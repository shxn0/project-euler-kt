package problems

// https://projecteuler.net/problem=2
fun main(args: Array<String>){

  var f1 = 0L
  var f2 = 1L
  var evens = mutableListOf<Long>()

  while (f2 < 4000000L){
    val tmp = f1 + f2
    f1 = f2
    f2 = tmp
    if(f1 % 2L == 0L) evens.add(f1)
  }
  val ans = evens.sum()
  println(ans)
}