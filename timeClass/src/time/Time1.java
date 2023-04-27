package time;

public class Time1 {
    private  int hour;
    private  int minutes;
    private  int seconds;

    public Time1(int hour, int minutes, int seconds){
       validate(hour,minutes,seconds);
       this.hour = hour;
       this.minutes = minutes;
       this.seconds = seconds;
    }

    private static void validate(int hour, int minutes, int seconds) {
        validateHour(hour);
        validateMinutes(minutes);
        validatesSeconds(seconds);
    }
    private static void validateHour(int hour) {
        boolean hourIsInValid = hour < 0 || hour> 23;
        if (hourIsInValid) throw new IllegalArgumentException(" The range of hour should be b/w 0 and 23");
    }
    private static void validateMinutes(int minutes) {
        boolean minutesIsInValid = minutes < 0 || minutes> 59;
        if (minutesIsInValid) throw new IllegalArgumentException(" The range of minutes should be b/w 0 and 59");
    }
    private static void validatesSeconds(int seconds) {
        boolean secondIsInValid = seconds < 0 || seconds> 59;
        if (secondIsInValid) throw new IllegalArgumentException(" The range of hour should be b/w 0 and 59");
    }
}
