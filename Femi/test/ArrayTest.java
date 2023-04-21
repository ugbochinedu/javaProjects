import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayTest {

    @Test
    public void reverseTest(){
        ArrayNumber arrayNumber= new ArrayNumber();
        int[] numbers = {1,2,3,4,50, 7, 4};
        assertArrayEquals(new int[]{4,7,50,4,3,2,1}, arrayNumber.reverseArray(numbers) );
    }
}
