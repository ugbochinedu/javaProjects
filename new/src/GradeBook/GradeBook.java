package GradeBook;

public class GradeBook {
    private String courseName;
    private final int[] grades;

    public GradeBook(String courseName, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMinimum(){
        int lowestGrade = grades[0];
        for (int value: grades) {
            if(value < lowestGrade) lowestGrade = value;
        }
        return lowestGrade;
    }

    public int getMaximum(){
        int highestGrade = grades[0];
        for (int value: grades) {
            if (value > highestGrade) highestGrade = value;
        }
        return highestGrade;
    }

    public double getAverage(){
        int sum = 0;
        double average = 0;

        for (int values: grades) {
            sum += values;
            average = (double) sum / grades.length;
        }
        return average;
    }

    public void outputBarChart(){
        System.out.println("Grade distribution");

        int[] frequency = new int[11];

        for (int value: grades) {
            ++frequency[value / 10];
        }

        for (int counter = 0; counter < frequency.length; counter++) {
            if(counter == 10) System.out.printf("%7d:  ", 100);
            else {
                System.out.printf("%02d - %02d:  ", counter * 10, counter * 10 + 9);
            }
            for (int stars = 0; stars < frequency[counter]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void outputGrades(){
        System.out.printf("The grades are:%n%n");

        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
        }
    }

    public void processGrades(){
        System.out.printf("Welcome to the grade book for%n%s%n%n", getCourseName());
        outputGrades();
        System.out.printf("%nClass average is %.2f%n", getAverage());
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());
        outputBarChart();
    }
}
