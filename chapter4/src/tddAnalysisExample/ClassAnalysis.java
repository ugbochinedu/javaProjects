package tddAnalysisExample;

public class ClassAnalysis {
    private int passes;
    private int failed;
    private int studentsCounter;


    public void setStudentsResult(int result) {
        if(result == 1){
           passes = passes + 1;
        }
        else failed = failed + 1;
    }
    public int getStudentResult() {
        return passes;
    }

    public void increaseCounter(int analysisCounter) {
       while (analysisCounter <= 10)studentsCounter = analysisCounter + 1;
    }

    public int getCounter() {
        return studentsCounter;
    }
}
