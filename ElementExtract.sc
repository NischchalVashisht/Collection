@scala.annotation.tailrec
def elemextract(list: List[Int], element:Int, increment:Int):Int= {
  if (increment == element - 1) list.head

  else {
    list match {
      case Nil => 1
      //  case head::Nil if(inc==elem-1)=> 0
      case head :: rest => elemextract(rest, element, increment + 1)
    }

  }
}

elemextract(List(1,2,3,4,5),1,0)
