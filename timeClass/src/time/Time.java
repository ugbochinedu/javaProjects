package time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int hour, int minute){
        this(hour,minute,0);
    }

    public Time(int hour){
        this(hour,0);
    }
    public static void validateTime(int hour, int minute, int second){
        validateHour(hour);
        validateMinutes(minute);
        validateSecond(second);
    }
    public static void validateHour(int hour){
        boolean hourIsInvalid = hour < 0 || hour > 23;
        if(hourIsInvalid) throw new IllegalArgumentException("Hour should be between 0 and 23");
    }
    public static void validateMinutes(int minute){
        boolean minuteIsInvalid = minute < 0 || minute > 59;
        if (minuteIsInvalid) throw new IllegalArgumentException("Minutes should be between 0 and 59");
    }
    public static void validateSecond(int second){
        boolean secondIsInvalid = second < 0 || second > 59;
        if(secondIsInvalid) throw new IllegalArgumentException("Seconds should be between 0 and 59");
    }

    public int getHour(int hour) {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinutes(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }
}
