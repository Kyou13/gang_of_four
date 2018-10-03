class StudentList(studentCount: Int) {
  private val students: Array[Student] = new Array[Student](studentCount)
  private var last: Int = 0
  def add(student: Student) {
    students(last) = student
    last += 1
  }
  def getStudentAt(index: Int) = students(index)
  def getLastNum() = last
}
