package arraytest;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayNumbersTest {
    ArrayNumbers arrayNumbers;

    @BeforeEach
    void beginOnEachWith(){
        arrayNumbers = new ArrayNumbers();
        assertNotNull(arrayNumbers);
    }
    @Test
    void checkMultipliedSelf(){
        int[] numbers = {2,4,6,3,5,1};
        int[] products= {4,16,36,9,25,1};
        assertArrayEquals(products,arrayNumbers.multiplySelf(numbers));
    }

    @Test
    void checkAscendingOrder(){
        int[] numbers = {2,4,6,3,5,1};
        int[] ascending = {1,2,3,4,5,6};
        assertArrayEquals(ascending,arrayNumbers.ascendingOrder(numbers));
    }

    @Test
    void checkDescendingOrder(){
        int[] numbers = {2,4,6,3,5,1};
        int[] descending = {6,5,4,3,2,1};
        assertArrayEquals(descending,arrayNumbers.descendingOrder(numbers));
    }
}
