@scala.annotation.tailrec
def elemextract(list: List[Int],newlist:List[Int], element:Int, increment:Int):List[Int]= {
  if (increment == element ) newlist.dropRight(1):::list

  else {
    list match {
      case Nil => List()
      //  case head::Nil if(inc==elem-1)=> 0
      case head :: rest => elemextract(rest,newlist:+head, element, increment + 1)
    }

  }
}

elemextract(List(1,2,3,4,5),List(),1,0)
