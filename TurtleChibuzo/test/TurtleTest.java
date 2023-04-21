import Turtle.Turtle;
import org.junit.jupiter.api.Test;
import static Turtle.Direction.*;
import static org.testng.AssertJUnit.*;
import Turtle.Position;
import Turtle.SketchPad;

public class TurtleTest {
    Turtle ijapa = new Turtle();
    private SketchPad sketchPad = new SketchPad(20,20);

    @Test
    public void thereIsATurtleTest(){
        assertNotNull(ijapa);
    }

    @Test
    public void turtleCanMovePenDownTest(){
        //assertTrue(ijapa.penIsUp());
        assertFalse(ijapa.isPenDown());
        ijapa.movePenDown();
        //assertFalse(ijapa.penIsUp());
        assertTrue(ijapa.isPenDown());
    }

    @Test
    public void TurtleCanMovePenUpTest(){
        ijapa.movePenDown();
        ijapa.movePenUp();
        assertFalse(ijapa.isPenDown());
    }

    @Test
    public void turtleCanTurnRightFacingEastTest(){
        assertSame(EAST, ijapa.getDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getDirection());
    }

    @Test
    public void turtleCanTurnRightFacingSouthTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getDirection());
    }

    @Test
    public void turtleCanTurnRightFacingWestTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH,ijapa.getDirection());
    }

    @Test
    public void turtleCanTurnRightFacingNorthTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(EAST,ijapa.getDirection());
    }

    @Test
    public void turtleCanTurnLeftFacingEastTest(){
        assertSame(EAST, ijapa.getDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getDirection());
    }

    @Test
    public void turtleCanTurnLeftFacingNorthTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST,ijapa.getDirection());
    }

    @Test
    public void turtleCanTurnLeftFacingWestTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(SOUTH,ijapa.getDirection());
    }

    @Test
    public void turtleCanTurnLeftFacingSouthTest() {
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(EAST, ijapa.getDirection());
    }

    @Test
    public void TurtleCanMoveWhileFacingEastTest(){
        assertSame(EAST,ijapa.getDirection());
        assertFalse(ijapa.isPenDown());
        assertEquals(new Position(0,0),ijapa.getPosition());
        ijapa.moveForward(5, sketchPad);
        ijapa.moveForward(2,sketchPad);
        assertEquals(new Position(0,7), ijapa.getPosition());
    }

    @Test
    public void TurtleCanMoveWhileFacingWestTest(){
        ijapa.moveForward(3,sketchPad);
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.moveForward(2,sketchPad);
        assertEquals(new Position(0,1),ijapa.getPosition());
    }

    @Test
    public void TurtleCanMoveWhileFacingSouth(){
        ijapa.moveForward(5,sketchPad);
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getDirection());
        ijapa.moveForward(3, sketchPad);
        assertEquals(new Position(3,5), ijapa.getPosition());
    }

    @Test
    public void TurtleCanMoveWhileFacingNorth(){
        ijapa.moveForward(5,sketchPad);
        ijapa.turnRight();
        ijapa.moveForward(5,sketchPad);
        ijapa.turnRight();
        ijapa.moveForward(3,sketchPad);
        ijapa.turnRight();
        ijapa.moveForward(3,sketchPad);
        assertEquals(new Position(2,2), ijapa.getPosition());
    }

    @Test
    public void turtleCanWriteWithPenDownWhileFacingEastTest(){
        //SketchPad sketchPad = new SketchPad(20,20);
        assertSame(EAST, ijapa.getDirection());
        assertEquals(new Position(0,0), ijapa.getPosition());
        ijapa.movePenDown();
        ijapa.moveForward(5, sketchPad);
        assertEquals(new Position(0,5), ijapa.getPosition());
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[0][3]);
        assertEquals(1, floor[0][4]);
        assertEquals(1, floor[0][5]);
    }

    @Test
    public void turtleCanWriteWithPenDownWhileFacingSouthTest(){
        ijapa.movePenDown();
        ijapa.moveForward(5,sketchPad);
        ijapa.turnRight();
        ijapa.movePenDown();
        ijapa.moveForward(5,sketchPad);
        assertEquals(new Position(5,5), ijapa.getPosition());
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][5]);
        assertEquals(1, floor[1][5]);
        assertEquals(1, floor[2][5]);
        assertEquals(1, floor[3][5]);
        assertEquals(1, floor[4][5]);
        assertEquals(1, floor[5][5]);
    }

    @Test
    public void turtleCanWriteWithPenDownWhileFacingWestTest(){
        ijapa.movePenDown();
        ijapa.moveForward(5,sketchPad);
        ijapa.turnRight();
        ijapa.movePenDown();
        ijapa.moveForward(5,sketchPad);
        ijapa.turnRight();
        ijapa.movePenDown();
        ijapa.moveForward(3,sketchPad);
        assertEquals(new Position(5,2), ijapa.getPosition());
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[5][5]);
        assertEquals(1, floor[5][4]);
        assertEquals(1, floor[5][3]);
        assertEquals(1, floor[5][2]);
    }
    @Test
    public void turtleCanWriteWithPenDownWhileFacingNorthTest(){
        ijapa.movePenDown();
        ijapa.moveForward(5,sketchPad);
        ijapa.turnRight();
        ijapa.movePenDown();
        ijapa.moveForward(5,sketchPad);
        ijapa.turnRight();
        ijapa.movePenDown();
        ijapa.moveForward(3,sketchPad);
        ijapa.turnRight();
        ijapa.movePenDown();
        ijapa.moveForward(3,sketchPad);
        assertEquals(new Position(2,2), ijapa.getPosition());
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[5][2]);
        assertEquals(1, floor[4][2]);
        assertEquals(1, floor[3][2]);
        assertEquals(1, floor[2][2]);
    }
}
