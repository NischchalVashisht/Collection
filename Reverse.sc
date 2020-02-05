def revers(list:List[Int]):List[Int]= {
  //println(list.reverse)
  list match {
    case h :: tail => revers(tail) ::: List(h)
    case Nil => Nil
  }
}
println(revers(List(1,2,3,4)))
