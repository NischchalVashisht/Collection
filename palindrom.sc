def chkPalindrom(list:List[Int]):Boolean={
   list match{
    case Nil=> true

    case h::Nil=>true
    case h::t=>if(h==t.last) chkPalindrom(t.dropRight(1)) else false

}


}

chkPalindrom(List(1,2,2,3,1))
