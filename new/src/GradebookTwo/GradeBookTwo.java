package GradebookTwo;

public class GradeBookTwo {
    private String courseName;
    private final int[][] gradeBook;

    public GradeBookTwo(String courseName, int[][] grades){
        this.courseName = courseName;
        gradeBook = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMinimum(){
        int lowGrade = gradeBook[0][0];

        for (int[] studentGrade:gradeBook) {
            for (int testScore:studentGrade) {
                if (testScore < lowGrade) lowGrade = testScore;
            }
        }
        return lowGrade;
    }

    public int getMaximum(){
        int maximumGrade = gradeBook[0][0];

        for (int[] studentGrade:gradeBook) {
            for (int score:studentGrade) {
                if(score > maximumGrade) maximumGrade = score;
            }
        }
        return maximumGrade;
    }

    public double getAverage(int[] gradeBook) {
        int sum = 0;

        for (int studentGrades : gradeBook) {
            sum = sum + studentGrades;
        }
        return  (double) sum / gradeBook.length;
    }

    public void outputBarChart(){
        System.out.println("Overall grade distribution");

        int[] frequency = new int[11];

        for (int[] studentGrade:gradeBook) {
            for (int gradeScore : studentGrade) {
                ++frequency[gradeScore / 10];
            }
        }

        for (int frequencyCounter = 0; frequencyCounter < frequency.length; frequencyCounter++) {
            if(frequencyCounter == 10){
                System.out.printf("%7d: ", 100);
            }
            else{
                System.out.printf("%02d - %02d: ", frequencyCounter * 10, frequencyCounter * 10 + 9);
            }

            for (int stars = 0; stars < frequency[frequencyCounter]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void outputGrades(){
        System.out.printf("The grades are:%n%n");
        System.out.print("              ");

        for (int test = 0; test < gradeBook[test].length; test++) {
            System.out.printf("Test %d   ", test);
        }
        System.out.println("Average");

        for (int student = 0; student < gradeBook.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test:gradeBook[student]) {
                System.out.printf("%8d", test);
            }

            double average = getAverage(gradeBook[student]);
            System.out.printf("%12.2f", average);
            System.out.println();
        }
    }

    public void processGrade(){
        outputGrades();
        System.out.printf("%n%s %d%n%s %d%n%n", "lowest grade in the grade book is", getMinimum(),
                        "Highest grade in the grade is", getMaximum());
        outputBarChart();
    }
}
