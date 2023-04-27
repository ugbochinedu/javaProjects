package studentManagementApp;

public class Student {

    private String firstName;
    private String lastName;
    private final int admissionNumber;
    private String address;
    private int age;

    public Student(String firstName, String lastName, int admissionNumber, String address, int age) {
        validateAge(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.admissionNumber = admissionNumber;
        this.address = address;
        this.age = age;
    }

    public static void validateAge(int age) {
        boolean ageIsInvalid = age < 15;
        if (ageIsInvalid) throw new IllegalArgumentException("Age should be above 15");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setStudentAddress(String address) {
        this.address = address;
    }

    public String getStudentAddress() {
        return address;
    }

    public int getAdmissionNumber(){
        return admissionNumber;
    }

    @Override
    public String toString() {
        return "Student details {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", admissionNumber=" + admissionNumber +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
