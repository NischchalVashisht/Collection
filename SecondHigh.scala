class SecondHigh{

  def secondMax(list:List[Int]):Int={

    val answr = this.issort(list)
    answr.dropRight(1).last
  }


  def issort(inputlist: List[Int]):List[Int]={
    if(inputlist.isEmpty) Nil
    else insert(inputlist.head,issort(inputlist.tail))
  }

  def insert(x: Int, xs: List[Int]): List[Int] =
    if (xs.isEmpty || x <= xs.head) x :: xs
    else xs.head :: insert(x, xs.tail)

}

object Main extends App{
  val firstobject=new SecondHigh
  println(firstobject.secondMax(List(3,2,1,5,4)))
}
