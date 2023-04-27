package ChapterEight;

public class TimeOneMain {
    public static void main(String[] args) {
        TimeOne timeOne = new TimeOne();
        timeOne.setTime(13,34,56);
        timeOne.toUniversalString();
        timeOne.displayTime();
        timeOne.toString();
    }
}
