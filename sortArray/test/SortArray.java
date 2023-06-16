import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertSame;

public class SortArray {

    @Test
    public void sort(){
        int[] arr = {10,9,8,2,1,7};
        assertSame(arr,SortArr.sort(arr) );
    }
}
