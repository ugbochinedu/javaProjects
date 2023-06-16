import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PersonalityTest {

    Scanner scanner = new Scanner(System.in);
    private int countExtroAndIntroAs;
    private int countExtroAndIntroBs;
    private int countSensingAndIntuitiveAs;
    private int countSensingAndIntuitiveBs;
    private int countThinkingAndFeelingAs;
    private int countThinkingAndFeelingBs;
    private int countJudgingAndPerceptiveAs;
    private int countJudgingAndPerceptiveBs;
    private String name;

    ArrayList<String> Extro = new ArrayList<>();
    ArrayList<String> sense = new ArrayList<>();
    ArrayList<String> think = new ArrayList<>();
    ArrayList<String> judge = new ArrayList<>();


    public void name(){
        print("What is your name?");
        String name = scanner.next();
        if (isNameValid(name)){
            this.name = name;
        }else {
            print("Invalid name imputation");
            name();
        }
    }

    private boolean isNameValid(String name) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        return pattern.matcher(name).matches();
    }

    public void answerQuestionOne(){
                print("""
                Choose option  A or B
                A) expend energy, enjoy groups 
                B) conserve energy, enjoy 0ne-on-one
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countExtroAndIntroAs++;
            Extro.add(" A    expend energy, enjoy groups");
        }else if (answer == 'B'){
            countExtroAndIntroBs++;
            Extro.add(" B   conserve energy, enjoy 0ne-on-one");
        }else {
            print("Incorrect input, try again");
            answerQuestionOne();
        }

    }
    public void answerQuestionTwo(){
                print("""
                Choose option  A or B
                A) interpret literally,                   
                B) look for meaning and possibilities:
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countSensingAndIntuitiveAs++;
            sense.add("A    expend energy, enjoy groups");
        }else if (answer == 'B'){
            countSensingAndIntuitiveBs++;
            sense.add("B    look for meaning and possibilities");
        }else {
            print("Incorrect input, try again");
            answerQuestionTwo();
        }
    }
    public void answerQuestionThree(){
        System.out.print("""
                Choose option  A or B
                A) logical, thinking, questioning
                B)  empathetic, feeling, accommodating:                                                   
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countThinkingAndFeelingAs++;
            think.add("A    logical, thinking, questioning");
        }else if (answer == 'B'){
            countThinkingAndFeelingBs++;
            think.add("B    empathetic, feeling, accommodating");
        }else {
            print("Incorrect input, try again");
            answerQuestionThree();
        }
    }
    public void answerQuestionFour(){
                print("""
                Choose option  A or B
                A) organized, orderly
                B) flexible, adaptable:
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countJudgingAndPerceptiveAs++;
            judge.add("A   organized, orderly");
        }else if (answer == 'B'){
            countJudgingAndPerceptiveBs++;
            judge.add("B   flexible, adaptable");
        }else {
            print("Incorrect input, try again");
            answerQuestionFour();
        }
    }

    public void answerQuestionFive(){
                print("""
                Choose option  A or B
                A) more outgoing, think out loud                   
                B)  more reserved, think to yourself:
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countExtroAndIntroAs++;
            Extro.add(" A    more outgoing, think out loud ");
        }else if (answer == 'B'){
            countExtroAndIntroBs++;
            Extro.add("B    more reserved, think to yourself");
        }else {
            print("Incorrect input, try again");
            answerQuestionFive();
        }
    }

    public void answerQuestionSix(){
                print("""
                Choose option  A or B
                A) practical, realistic, experiential 
                B) imaginative, innovative, theoretical:
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countSensingAndIntuitiveAs++;
            sense.add("A    practical, realistic, experiential");
        }else if (answer == 'B'){
            countSensingAndIntuitiveBs++;
            sense.add("B    imaginative, innovative, theoretical");
        }else {
            print("Incorrect input, try again");
            answerQuestionSix();
        }
    }

    public void answerQuestionSeven(){
                print("""
                Choose option  A or B
                A) candid, straightforward,frank
                B) tactful, kind, encouraging:
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countThinkingAndFeelingAs++;
            think.add("A   candid, straightforward,frank");
        }else if (answer == 'B'){
            countThinkingAndFeelingBs++;
            think.add("B    tactful, kind, encouraging");
        }else {
            print("Incorrect input, try again");
            answerQuestionSeven();
        }
    }

    public void answerQuestionEight(){
                print("""
                Choose option  A or B
                A) plan, schedule 
                B) unplanned, spontaneous
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countJudgingAndPerceptiveAs++;
            judge.add("A   plan, schedule");
        }else if (answer == 'B'){
            countJudgingAndPerceptiveBs++;
            judge.add(" B   unplanned, spontaneous");
        }else {
            print("Incorrect input, try again");
            answerQuestionEight();
        }
    }

    public void answerQuestionNine(){
                print("""
                Choose option  A or B
                A) seek many tasks, public activities, interaction with others                                               
                B) seek private solitary activities with quiet to concentrate:
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countExtroAndIntroAs++;
            Extro.add("A    seek many tasks, public activities, interaction with others");
        }else if (answer == 'B'){
            countExtroAndIntroBs++;
            Extro.add("B    seek private solitary activities with quiet to concentrate");
        }else {
            print("Incorrect input, try again");
            answerQuestionNine();
        }
    }

    public void answerQuestionTen(){
                print("""
                Choose option  A or B
                A) standard, usual,  conventional                 
                B) different, novel, unique:
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countSensingAndIntuitiveAs++;
            sense.add("A  standard, usual, conventional");
        }else if (answer == 'B'){
            countSensingAndIntuitiveBs++;
            sense.add("B   different, novel, unique");
        }else {
            print("Incorrect input, try again");
            answerQuestionTen();
        }
    }

    public void answerQuestionEleven(){
                print("""
                Choose option  A or B
                A) firm, tend to criticize, hold the line 
                B) gentle, tend to appreciate, conciliate
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countThinkingAndFeelingAs++;
            think.add("A   firm, tend to criticize, hold the line");
        }else if (answer == 'B'){
            countThinkingAndFeelingBs++;
            think.add("B   gentle, tend to appreciate, conciliate");
        }else {
            print("Incorrect input, try again");
            answerQuestionEleven();
        }
    }

    public void answerQuestionTwelve(){
                print("""
                Choose option  A or B
                A) regulated, structured 
                B) easygoing, live and let live:
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countJudgingAndPerceptiveAs++;
            judge.add("A   regulated, structured");
        }else if (answer == 'B'){
            countJudgingAndPerceptiveBs++;
            judge.add("B   easygoing, live and let live");
        }else {
            print("Incorrect input, try again");
            answerQuestionTwelve();
        }
    }
    public void answerQuestionThirteen(){
                print("""
                Choose option  A or B
                A) external, communicative, express yourself 
                B)  internal, reticent, keep to yourself:
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countExtroAndIntroAs++;
            Extro.add("A   external, communicative, express yourself");
        }else if (answer == 'B'){
            countExtroAndIntroBs++;
            Extro.add("B   internal, reticent, keep to yourself");
        }else {
            print("Incorrect input, try again");
            answerQuestionThirteen();
        }
    }
    public void answerQuestionFourteen(){
                print("""
                Choose option  A or B
                A) focus on here and now 
                B)  look to the future, global perspective, big picture:                                                   
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countSensingAndIntuitiveAs++;
            sense.add("A   focus on here and now ");
        }else if (answer == 'B'){
            countSensingAndIntuitiveBs++;
            sense.add("B    look to the future, global perspective, big picture");
        }else {
            print("Incorrect input, try again");
            answerQuestionFourteen();
        }
    }

    public void answerQuestionFifteen(){
                print("""
                Choose option  A or B
                A) tough-minded, just 
                B) tender-hearted, merciful:
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countThinkingAndFeelingAs++;
            think.add("A    tough-minded, just");
        }else if (answer == 'B'){
            countThinkingAndFeelingBs++;
            think.add("B   tender-hearted, merciful");
        }else {
            print("Incorrect input, try again");
            answerQuestionFifteen();
        }
    }

    public void answerQuestionSixteen(){
                print("""
                Choose option  A or B
                A) preparation, plan, ahead
                B) go with the flow, adapt as you go:                                                   
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countJudgingAndPerceptiveAs++;
            judge.add("A   preparation, plan, ahead");
        }else if (answer == 'B'){
            countJudgingAndPerceptiveBs++;
            judge.add("B    go with the flow, adapt as you go");
        }else {
            print("Incorrect input, try again");
            answerQuestionSixteen();
        }
    }

    public void answerQuestionSeventeen(){
                print("""
                Choose option  A or B
                A) active, initiate
                B) reflective, deliberate
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countExtroAndIntroAs++;
            Extro.add("A    active, initiate");
        }else if (answer == 'B'){
            countExtroAndIntroBs++;
            Extro.add("B   reflective, deliberate");
        }else {
            print("Incorrect input, try again");
            answerQuestionSeventeen();
        }
    }

    public void answerQuestionEighteen(){
                print("""
                Choose option  A or B
                A) facts, things, what is                  
                B) ideas, dreams, "what could be", philosophical:                                                   
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countSensingAndIntuitiveAs++;
            sense.add("A    facts, things, what is");
        }else if (answer == 'B'){
            countSensingAndIntuitiveBs++;
            sense.add("B    ideas, dreams, what could be, philosophical");
        }else {
            print("Incorrect input, try again");
            answerQuestionEighteen();
        }
    }

    public void answerQuestionNineteen(){
                print("""
                Choose option  A or B
                A)  matter of fact, issue-oriented                  
                B)  sensitive, people-oriented, compassionate:                                                  
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countThinkingAndFeelingAs++;
            think.add("A   matter of fact, issue-oriented");
        }else if (answer == 'B'){
            countThinkingAndFeelingBs++;
            think.add("B    sensitive, people-oriented, compassionate");
        }else {
            print("Incorrect input, try again");
            answerQuestionNineteen();
        }
    }
    public void answerQuestionTwenty(){
                print("""
                Choose option  A or B
                A) control, govern 
                B) latitude, freedom
                """);

        char answer = scanner.next().charAt(0);
        if(answer == 'A'){
            countJudgingAndPerceptiveAs++;
            judge.add("A   control, govern ");
        }else if (answer == 'B'){
            countJudgingAndPerceptiveBs++;
            judge.add("latitude, freedom");
        }else {
            print("Incorrect input, try again");
            answerQuestionTwenty();
        }
    }

    public void print(String input){
        System.out.println(input);
    }

    public void printAll(){
        print("HI, " + name + " you selected");
        printExtro();
        printSense();
        printThink();
        printJudge();
    }

    private void printJudge() {
        for (int i = 0; i < judge.size(); i++) {
            System.out.println(judge.get(i));
        }
        System.out.println("Number of A selected is " + countJudgingAndPerceptiveAs);
        System.out.println("Number of B selected is " + countJudgingAndPerceptiveBs +"\n");
    }

    private void printThink() {
        for (int i = 0; i < think.size(); i++) {
            System.out.println(think.get(i));
        }
        System.out.println("Number of A selected is " + countThinkingAndFeelingAs);
        System.out.println("Number of B selected is " + countThinkingAndFeelingBs +"\n");
    }

    private void printSense() {
        for (int i = 0; i < sense.size(); i++) {
            System.out.println(sense.get(i));
        }
        System.out.println("Number of A selected is " + countSensingAndIntuitiveAs);
        System.out.println("Number of B selected is " + countSensingAndIntuitiveBs +"\n");
    }

    private void printExtro() {
        for (String s : Extro) {
            System.out.println(s);
        }
        System.out.println("Number of A selected is " + countExtroAndIntroAs);
        System.out.println("Number of B selected is " + countExtroAndIntroBs +"\n");
    }

    public void trait(){
        System.out.println("Your personality is: ");
        if(countExtroAndIntroAs > countExtroAndIntroBs){
            System.out.print("E");
        }else {
            System.out.print("I");
        }

        if (countSensingAndIntuitiveAs > countSensingAndIntuitiveBs){
            System.out.print("S");
        }else{
            System.out.print("N");
        }

        if(countThinkingAndFeelingAs > countThinkingAndFeelingBs){
            System.out.print("T");
        }else{
            System.out.print("F");
        }

        if (countJudgingAndPerceptiveAs > countJudgingAndPerceptiveBs){
            System.out.print("J");
        }else{
            System.out.print("P");
        }
    }

//    @Override
//    public String toString() {
//        return "PersonalityTest{" +
//                "scanner=" + scanner +
//                ", countExtroAndIntroAs=" + countExtroAndIntroAs +
//                ", countExtroAndIntroBs=" + countExtroAndIntroBs +
//                ", countSensingAndIntuitiveAs=" + countSensingAndIntuitiveAs +
//                ", countSensingAndIntuitiveBs=" + countSensingAndIntuitiveBs +
//                ", countThinkingAndFeelingAs=" + countThinkingAndFeelingAs +
//                ", countThinkingAndFeelingBs=" + countThinkingAndFeelingBs +
//                ", countJudgingAndPerceptiveAs=" + countJudgingAndPerceptiveAs +
//                ", countJudgingAndPerceptiveBs=" + countJudgingAndPerceptiveBs +
//                ", name='" + name + '\'' +
//                '}';
//    }
}

