class MyStudentListIterator(list: MyStudentList) extends Iterator{
  val myStudentList: MyStudentList = list
  var index: Int = 0
  def hasNext(): Boolean = {
    if(myStudentList.getLastNum() > index){
      true
    }else{
      false
    }
  }

  def next(): Student = {
    val s: Student = myStudentList.getStudentAt(index)
    index += 1
    s
  }
}
