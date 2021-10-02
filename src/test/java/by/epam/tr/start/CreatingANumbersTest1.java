package by.epam.tr.start;

import by.epam.tr.start.CreatingANumbers;
import org.junit.Assert;
import org.junit.Test;

public class CreatingANumbersTest1 {

    @Test
    public void calculationSum() {
        double[] array1 = {3.0, 45.6, 98.0};
        double expected1 = 101D;

        Assert.assertEquals(expected1, CreatingANumbers.countSumOfLargestAndSmallestNumbers(array1), 0.00000001);
    }
}
