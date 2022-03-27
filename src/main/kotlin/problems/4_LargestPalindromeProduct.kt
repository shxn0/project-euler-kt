package problems

fun main(args: Array<String>){
  val palinds = mutableListOf<Long>()

  for(a in 100..999L){
    for (b in 100..999L){
      val res = a * b
      if(res == res.toString().reversed().toLong()) palinds.add(res)
    }
  }

  val sorted = palinds.sorted()
  println(sorted)
  println(sorted.takeLast(1))
}