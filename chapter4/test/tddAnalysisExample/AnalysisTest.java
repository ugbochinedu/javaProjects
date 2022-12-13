package tddAnalysisExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnalysisTest {

    @Test

    public void ClassAnalysis1(){
        ClassAnalysis classAnalysis = new ClassAnalysis();
        // when student scores 1
        classAnalysis.setStudentsResult(1);
        assertEquals(1, classAnalysis.getStudentResult());
    }

    @Test

    public void ClassAnalysis(){
        ClassAnalysis classAnalysis = new ClassAnalysis();
        // when student scores 1
        classAnalysis.setStudentsResult(0);
        assertEquals(0, classAnalysis.getStudentResult());
    }

    @Test

    public void CounterLessThanAndEquals10(){
        ClassAnalysis classAnalysis = new ClassAnalysis();
        classAnalysis.increaseCounter(1);
        assertEquals(2,classAnalysis.getCounter());
    }
    /*

    @Test

    public void CounterGreaterThan8DisplayBonusForInstructor(){
        ClassAnalysis classAnalysis = new ClassAnalysis();
        classAnalysis.getStudentResult();
        assertEquals(classAnalysis.getStudentResult(),classAnalysis.getStudentResult());
    }

     */
}
