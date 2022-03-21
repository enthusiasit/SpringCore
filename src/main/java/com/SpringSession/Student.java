package com.SpringSession;
// Creating beans --->> java pojos
public class Student {
    private int StudentId;
    private String StudentName;
    private String StudentAddress;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }

    public Student(int studentId, String studentName, String studentAddress) {
        StudentId = studentId;
        StudentName = studentName;
        StudentAddress = studentAddress;
    }
    public Student(){
    super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentAddress='" + StudentAddress + '\'' +
                '}';
    }
}
