public class HeartRates {
    private String firstName;
    private String lastName;
    private int yearBirth;
    private int monthBirth;
    private int dayBirth;
    private int age;
    private int maxiHeartRate;
    private int target;

    public HeartRates(String firstName, String lastName, int yearBirth, int monthBirth, int dayBirth){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setYearBirth(yearBirth);
        this.setMonthBirth(monthBirth);
        this.setDayBirth(dayBirth);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setMonthBirth(int monthBirth) {
        this.monthBirth = monthBirth;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public void setDayBirth(int dayBirth) {
        this.dayBirth = dayBirth;
    }

    public int getDayBirth() {
        return dayBirth;
    }

    public int age(){
        return this.age = 2022 - this.yearBirth;
    }

    public int maxiHeartRate(){
        return this.maxiHeartRate = 220 - this.age;
    }

    public int target(){
        return this.target = 50/100 * this.maxiHeartRate;
    }
}
