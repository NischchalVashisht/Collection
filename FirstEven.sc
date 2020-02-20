def firstEven(list: List[Int]):Int={

 
  list match {
    case Nil =>0
    case h::Nil if h%2==0  => h
    case h::t => firstEven(t)
  }
}

firstEven(List(5,4,3,2,1))
