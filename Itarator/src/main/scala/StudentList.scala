class StudentList(studentCount: Int = 0) {
  private var last: Int = 0
  private val students: Array[Student] = new Array[Student](studentCount)

  def add(student: Student) {
    students(last) = student
    last += 1
  }
  def getStudentAt(index: Int) = students(index)
  def getLastNum() = last
}
