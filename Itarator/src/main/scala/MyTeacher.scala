trait Teacher{
  val studentList: StudentList
  def createStudentList(): Unit
  def callStudents(): Unit
}

class MyTeacher extends Teacher {
  val studentList = new StudentList(3)
  def createStudentList() = {
    studentList.add(new Student("A太郎", 1))
    studentList.add(new Student("B太郎", 1))
    studentList.add(new Student("C子", 1))
  }
  def callStudents() = {
    val size: Int = studentList.getLastNum()
    for(i <- 0 until size){
      println(studentList.getStudentAt(i).getName())
    }
  }
}
