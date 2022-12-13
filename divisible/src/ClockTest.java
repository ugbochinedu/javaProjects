public class ClockTest {
    public static void main(String[] args) {
        Clock clockOne = new Clock(20,48,59);
        Clock clockTwo = new Clock(20,70,59);
        System.out.printf("%d:%d:%d%n", clockOne.getHour(), clockOne.getMinute(), clockOne.getSecond());
        System.out.printf("%d:%d:%d%n", clockTwo.getHour(), clockTwo.getMinute(), clockTwo.getSecond());
    }
}
