package problems

// https://projecteuler.net/problem=2
fun main(args: Array<String>){

  var f1 = 0
  var f2 = 1
  var evens = mutableListOf<Int>()

  while (f2 < 4000000){
    val tmp = f1 + f2
    f1 = f2
    f2 = tmp
    if(f1 % 2 == 0) evens.add(f1)
  }
  val ans = evens.sum()
  println(ans)
}