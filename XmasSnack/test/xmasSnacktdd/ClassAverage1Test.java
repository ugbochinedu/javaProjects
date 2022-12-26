package xmasSnacktdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassAverage1Test {
    ClassAverage classAverage;

    @BeforeEach

    void BeforeEachTest(){
        classAverage = new ClassAverage();
    }

    @Test

    void StudentGrade(){
        classAverage.setStudentGrade();
        assertEquals(50,classAverage.getStudentGrade());
    }

    @Test

    void TotalStudentGrade(){
        classAverage.setStudentGrade();
        assertEquals(0, classAverage.getStudentGrade());
    }

    @Test

    void AverageGrade(){

    }
}
