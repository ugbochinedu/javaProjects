public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second){
        if (hour < 24) this.hour = hour;
        if (minute < 60) this.minute = minute;
        if (second < 60) this.second = second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getHour(){
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public int getSecond(){
        return second;
    }
}
