package studentManagementApp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentTest {

    Student student;

    @BeforeEach
    void setUpStudentDetails(){
        student = new Student("Chinedu",
                "Ugbo",
                1,
                "Address",
                15);
    }

    @Test

    void checkAgeCanBeChanged(){
        student.setAge(15);
        assertEquals(15,student.getAge());
    }

    @Test
    void checkAgeIsNotLessThan15(){
        Student.validateAge(15);
        assertEquals(15,student.getAge());
    }

    @Test
    void checkFirstNameCanBeChanged(){
        student.setFirstName("chima");
        assertEquals("chima",student.getFirstName());
    }

    @Test
    void checkLastNameCanBeChanged(){
        student.setLastName("chi");
        assertEquals("chi", student.getLastName());
    }

    @Test
    void checkStudentAddressCanBeChanged(){
        student.setStudentAddress("6 Tony");
        assertEquals("6 Tony", student.getStudentAddress());
    }
}
