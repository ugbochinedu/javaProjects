package studentManagementApp;

import java.util.*;

public class School {
    private String schoolName;
    private List<Student> students;
    private Student student;
    private int lastStudentAdmissionNumber;

    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public void createStudentDetails(String firstName, String lastName, String address, int age) {
        int studentAdmissionNumber = generateAdmissionNumber();
        student = new Student(firstName,lastName,studentAdmissionNumber,address,age);
        students.add(student);
    }

    private int generateAdmissionNumber() {
        return ++lastStudentAdmissionNumber;
    }

    public int totalNumberOfStudents() {
        return students.size();
    }

    public void updateFirstName(String firstName) {
        student.setFirstName(firstName);
    }

    public String getUpdatedFirstName() {
       return student.getFirstName();
    }

    public void updateLastName(String lastName) {
        student.setLastName(lastName);
    }

    public String getUpdatedLastName() {
      return  student.getLastName();
    }

    public void updateAddress(String address) {
        student.setStudentAddress(address);
    }

    public String getUpdatedAddress() {
       return student.getStudentAddress();
    }

    public Student getAllStudentsDetails() {
        for (Student student: students) {
            return student;
        }
        return (Student) students;
    }

//    public void removeStudentDetails(int admissionNumber) {
//        for (Student student: students) {
//            if(student.getAdmissionNumber() == admissionNumber) students.remove(student);
//        }
//    }
}
