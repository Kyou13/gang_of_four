class MyStudentList(studentCount: Int = 0) extends StudentList with Aggregate{
  private val students: Array[Student] = new Array[Student](studentCount)
  def iterator(): Iterator = {
    new MyStudentListIterator(this)
  }
}
