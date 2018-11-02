import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import sun.java2d.pipe.SpanShapeRenderer;

public class StringUtility {


    @Test
    public void missingNum_arrayEmpty()
    {
        int []A = {};

        assertEquals(testFib.SimpleUtility.missingNum(A),1);


    }

    @Test
    public void missingNum_arrSizeOne()
    {
        int []A = {190};

        assertEquals(testFib.SimpleUtility.missingNum(A),1);

    }

    @Test
    public void missing_first_or_last ()
    {
        int []A = {4,4,3,5,5};

        assertEquals(testFib.SimpleUtility.missingNum1(A),6);

    }

    @Test
    public void numberDecet()
    {
        //int []A = { 3, 1, 2, 4, 3};
        int A [] = {-1000, 1000};
        assertEquals(testFib.SimpleUtility.dividedArray(A),2000);
    }

    @Test
    public void normalDivide()
    {
        int []A = { 3, 1, 2, 4, 3};
        assertEquals(testFib.SimpleUtility.dividedArray(A),1);
    }
}
