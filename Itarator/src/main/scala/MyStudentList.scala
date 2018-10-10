class MyStudentList(studentCount: Int) extends StudentList(studentCount) with Aggregate{
  def iterator(): Iterator = {
    new MyStudentListIterator(this)
  }
}
