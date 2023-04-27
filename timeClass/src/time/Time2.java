package time;

public class Time2 {
    private int hour;
    private int minute;
    private int second;

    public Time2(int hour, int minute, int second){
        validate(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private static void validate(int hour, int minute, int second) {
        validateHour(hour);
        validateMinutes(minute);
        validateSecond(second);
    }

    private static void validateSecond(int second) {
        boolean secondIsValid = second < 0 || second >59;
        if(secondIsValid ) throw new IllegalArgumentException("Second should be between 0 and 59");
    }

    private static void validateMinutes(int minute) {
        boolean minuteIsValid = minute < 0 || minute >59;
        if(minuteIsValid) throw new IllegalArgumentException("Minutes should be between 0 and 59");
    }

    private static void validateHour(int hour) {
        boolean secondIsValid = hour < 0 || hour > 23;
        if(secondIsValid) throw new IllegalArgumentException("Hour should be between 0 and 24");
    }
}
