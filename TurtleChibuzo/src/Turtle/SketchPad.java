package Turtle;

public class SketchPad {
    private int[][] floor;

    public SketchPad(int floorRow, int floorColumn) {
        floor = new int[floorRow][floorColumn];
    }

    public int[][] getFloor() {
       return floor;
    }
}
