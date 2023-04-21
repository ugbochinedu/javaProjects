import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class AssignmentTest {
    String assignmentOne = "ab##d";
    Assignment assignment = new Assignment();

    @Test
    void changeToArray() {
        String[] resultArray = new String[]{"a", "b", "#", "#", "d"};
        ArrayList<String> arrList = new ArrayList<>(List.of(resultArray));
        assertEquals(arrList, assignment.changeToArray(assignmentOne) );
    }

    @Test
    void deletingPoundsRemovePoundsAndChar(){
        String[] resultArray = new String[]{"d"};
        ArrayList<String> arrList = new ArrayList<>(List.of(resultArray));
        assertEquals(arrList, assignment.deletePoundsChar(arrList));
    }

}