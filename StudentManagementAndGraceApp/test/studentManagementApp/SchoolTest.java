package studentManagementApp;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {
    School globetty;

    @BeforeEach
    void setUpSchool(){
        globetty = new School("Globetty");
        globetty.createStudentDetails("Chine","Ugb","6 aba",15);
    }

    @Test
    void createStudentDetailsPageFor(){
        assertEquals(1, globetty.totalNumberOfStudents());
    }

    @Test
    void studentFirstNameCanBeChanged(){
        globetty.updateFirstName("chi");
        assertEquals("chi", globetty.getUpdatedFirstName());
    }

    @Test
    void studentLastNameCanBeChanged(){
        globetty.updateLastName("chi");
        assertEquals("chi", globetty.getUpdatedLastName());
    }

    @Test
    void studentAddressCanBeChanged(){
        globetty.updateAddress("chi");
        assertEquals("chi", globetty.getUpdatedAddress());
    }

    @Test
    void checkSchoolCanGetAllStudentsDetails(){
        globetty.createStudentDetails("Chine","Ugb","6 aba",15);
        globetty.createStudentDetails("Chine","Ugb","6 aba",15);
        globetty.createStudentDetails("Chine","Ugb","6 aba",15);
        assertEquals(4,globetty.totalNumberOfStudents());
    }

//    @Test
//    void checkStudentDetailsCanBeRemoved(){
//        globetty.createStudentDetails("Chine","Ugb","6 aba",15);
//        globetty.removeStudentDetails(1);
//        assertEquals(1,globetty.totalNumberOfStudents());
//    }
}
