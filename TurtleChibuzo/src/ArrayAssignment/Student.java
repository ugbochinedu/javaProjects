package ArrayAssignment;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public String fullName;
    public int javaScore;
    public int pythonScore;
    public int javascriptScore;


    public String getFullName() {
        return fullName;

    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(int javaScore) {
        this.javaScore = javaScore;
    }

    public int getPythonScore() {
        return pythonScore;
    }

    public void setPythonScore(int pythonScore) {
        this.pythonScore = pythonScore;
    }

    public int getJavascriptScore() {
        return javascriptScore;
    }

    public void setJavascriptScore(int javascriptScore) {
        this.javascriptScore = javascriptScore;
    }

    public String toString(){
        int total = javaScore + pythonScore + javascriptScore;
        double average = total/3.0;
        return String.format(
            """
             %s     %s      %s      %s      %s      %s     
             """, fullName, javaScore,pythonScore,javascriptScore,total,average
        );
    }
}
