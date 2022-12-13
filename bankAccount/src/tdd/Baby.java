package tdd;

public class Baby {
    private int age;
    private int weightInKg;
    private String name;

    public Baby(int babyWeightAtBirth){
        weightInKg = babyWeightAtBirth;
    }

    public Baby(){

    }

    public Baby(String babyNameAtBirth){
        name = babyNameAtBirth;
    }
    public Baby(String babyNameAtBirth, int babyWeight){
        weightInKg = babyWeight;
        name = babyNameAtBirth;
    }

    public Baby(int babyNameAtBirth, String babyWeight){

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeightInKg() {
        return weightInKg;
    }
}
