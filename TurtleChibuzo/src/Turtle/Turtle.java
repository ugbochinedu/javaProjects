package Turtle;


import static Turtle.Direction.*;

public class Turtle {
    public Position position = new Position(0,0);
    private boolean penIsDown;
    private Direction direction = EAST;

    public Direction getDirection() {
        return direction;
    }

    public void turnRight() {
        if(direction == NORTH) face(EAST);
        else if(direction == WEST) face(NORTH);
        else if(direction == SOUTH) face(WEST);
        else if(direction == EAST) face(SOUTH);

//        if(direction == EAST) face(SOUTH);
//        else if(direction == SOUTH) face(WEST);
//        else if(direction == WEST) face(NORTH);
    }

    private void face(Direction newDirection){
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
        else if(direction == EAST) face(NORTH);
    }

    public void moveForward(int move) {
        if(direction == EAST) position.setColumn(position.getColumn()+ move);
        if (direction == WEST && move <= position.getColumn()) position.setColumn(position.getColumn() - move);
        throw new IllegalArgumentException("Turtle cannot move beyond 0");
    }

    public Position getPosition() {
        return position;
    }

}
