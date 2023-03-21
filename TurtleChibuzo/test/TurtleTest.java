import Turtle.Turtle;
import org.junit.jupiter.api.Test;
import static Turtle.Direction.*;
import static org.testng.AssertJUnit.*;
import Turtle.Position;

public class TurtleTest {
    Turtle ijapa = new Turtle();

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

        ijapa.moveForward(5);
        ijapa.moveForward(2);
        assertEquals(new Position(0,7), ijapa.getPosition());
    }

    @Test
    public void TurtleCanMoveWhileFacingWestTest(){
        ijapa.moveForward(5);
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.moveForward(6);
        assertEquals(new Position(0,0),ijapa.getPosition());
    }
}
