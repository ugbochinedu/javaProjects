package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {

    @Test

    public void Student(){
        Student student = new Student("chinedu");
        assertEquals("chinedu",student.getName());
    }
}
