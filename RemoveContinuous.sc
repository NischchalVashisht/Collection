def compress(actuallist:List[Int],myList:List[Int]):List[Int]={
   actuallist match {
     case Nil=>List()
     case head::Nil=> myList:+head
     case head ::tail=>{
         if(head==tail.head) compress(tail,myList)
         else compress(tail,myList:+head)
     }

   }

}

compress(List(1, 1, 1, 1, 2, 3, 3, 
