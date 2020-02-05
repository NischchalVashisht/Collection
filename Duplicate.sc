
  def createDuplicate(list:List[Int]):List[Int]={

    (list:::list).sorted
  }



createDuplicate(List(3,2,1,5,4))

