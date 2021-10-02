package by.epam.tr.start;

import by.epam.tr.start.CreatingANumbers;
import org.junit.Assert;
import org.junit.Test;

public class CreatingANumbersTest2 {
    @Test
    public void isArrayExist() {
        double[] array2 = {};
        double expected2 = 0D;

        Assert.assertEquals(expected2, CreatingANumbers.countSumOfLargestAndSmallestNumbers(array2), 0.00000001);
    }

}
