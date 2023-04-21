package Turtle;


import static Turtle.Direction.*;

public class Turtle {
    public Position position = new Position(0, 0);
    private boolean penIsDown;
    private Direction direction = EAST;

    public Direction getDirection() {
        return direction;
    }

    public void turnRight() {
        if (direction == NORTH) face(EAST);
        else if (direction == WEST) face(NORTH);
        else if (direction == SOUTH) face(WEST);
        else if (direction == EAST) face(SOUTH);

//        if(direction == EAST) face(SOUTH);
//        else if(direction == SOUTH) face(WEST);
//        else if(direction == WEST) face(NORTH);
    }

    private void face(Direction newDirection) {
        direction = newDirection;
    }

    //    public boolean penIsUp() {
//        return !penIsDown;
//    }
    public boolean isPenDown() {
        return penIsDown;
    }

    public void movePenDown() {
        penIsDown = true;
    }

    public void movePenUp() {
        penIsDown = false;
    }

    public void turnLeft() {
        if (direction == SOUTH) face(EAST);
        else if (direction == WEST) face(SOUTH);
        else if (direction == NORTH) face(WEST);
        else if (direction == EAST) face(NORTH);
    }

    public Position getPosition() {
        return position;
    }

    private void moveForward(int numberOfSteps) {
        if (direction == EAST) moveHorizontallyBY(numberOfSteps);
        if (direction == WEST) moveHorizontallyBY(-numberOfSteps);
        if (direction == SOUTH) moveVertically(numberOfSteps);
        if (direction == NORTH) moveVertically(-numberOfSteps);
    }

    private void moveVertically(int numberOfSteps){
        position.setRow(position.getRow() + numberOfSteps);
    }
    public void moveForward(int numberOfSteps, SketchPad sketchPad) {
        if (penIsDown) writeOn(sketchPad, numberOfSteps);
        moveForward(numberOfSteps);
    }

    private void writeOn(SketchPad sketchPad, int numberOfSteps) {
        var floor = sketchPad.getFloor();
        if (direction == EAST) writeEastWards(numberOfSteps, floor);
        if (direction == SOUTH) writeSouthWards(numberOfSteps,floor);
        if (direction == WEST) writeWestWards(numberOfSteps, floor);
        if (direction == NORTH) writeNorthWards(numberOfSteps, floor);
    }

    private void writeNorthWards(int numberOfSteps, int[][] floor) {
        int currentRow = position.getRow();
        int column = position.getColumn();
        for (int row = currentRow; row >= currentRow - numberOfSteps; row--) {
            floor[row][column] = 1;
        }
    }

    private void writeWestWards(int numberOfSteps, int[][] floor) {
        int row = position.getRow();
        int currentColumn = position.getColumn();
        for (int column = currentColumn; column >= currentColumn - numberOfSteps; column--) {
            floor[row][column] = 1;
        }
    }

    private void writeSouthWards(int numberOfSteps, int[][] floor) {
        int currentRow = position.getRow();
        int column = position.getColumn();
        for (int row = currentRow; row <= numberOfSteps + currentRow ; row++) {
            floor[row][column] = 1;
        }
    }

    private void writeEastWards(int numberOfSteps, int[][] floor) {
        int row = position.getRow();
        int currentColumn = position.getColumn();
        for (int column = currentColumn; column <= numberOfSteps + currentColumn; column++)
            floor[row][column] = 1;
    }

    public void moveHorizontallyBY ( int numberOfSteps){
        position.setColumn(numberOfSteps + position.getColumn());
    }
}
