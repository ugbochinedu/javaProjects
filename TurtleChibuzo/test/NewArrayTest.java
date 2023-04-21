import ArrayAssignment.ArrayNumber;
import ArrayAssignment.ArrayNumbers;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewArrayTest {

 //   @Test
//    public void canTakeInAnArray(){
//        ArrayNumbers arrayNumbers = new ArrayNumbers();
//        int[] arrayList = {1,2,3,4,5};
//        arrayNumbers.collectNumbers(arrayList);
//        int[] expectedArray = {2,4};
//        assertArrayEquals(expectedArray,arrayNumbers.getArrayList());
//        //assertEquals(,arrayNumbers.getArrayList());
//    }
//}

    @Test
    public void multiplyByTwo() {
        ClassWork.ClassWork multiply = new ClassWork.ClassWork();
        int[] listOfNumbers = {2, 4, 3, 1, 3, 4};
        multiply.multiplyByTwo(listOfNumbers);
        int[] result = {4, 8, 6, 2, 6, 8};
        assertArrayEquals(result, multiply.getListOfNumbers());
    }

    @Test
    public void maxInAnArray() {
        ClassWork.ClassWork multiply = new ClassWork.ClassWork();
        int[] numbers = {4, 8, 6, 2, 6, 8};
        multiply.maximumInArray(numbers);
        assertEquals(8, multiply.getMaximumNumber());
    }

    @Test
    public void minInArray() {
        ClassWork.ClassWork num = new ClassWork.ClassWork();
        int[] arrayNumbers = {8, 4, 3, 5, 2, 1};

        assertEquals(1, num.minimumInArray(arrayNumbers));
        //assertEquals(1,num.getMinimumNumber());
    }

    @Test
    public void addNumbersInArrayTest() {
        ClassWork.ClassWork assignment = new ClassWork.ClassWork();
        int[] arr = {2, 4, 3, 1, 5};
        assertEquals(15, assignment.addNumbersInsideArray(arr));
    }

    @Test
    public void subtractFirstIndexTest(){
        ClassWork.ClassWork assignment = new ClassWork.ClassWork();
        int[] arr = {2, 4, 3, 1, 5};
        assertEquals(13, assignment.addNumbersInsideArray(arr));
    }


}