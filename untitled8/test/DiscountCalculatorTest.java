import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    DiscountCalculator discountCalculator = new DiscountCalculator();

    @Test
    public void shouldGiveNoDiscountForValue() {
        int buySumm = 999;
        int expectedSumm = 999;

        int resultSum = discountCalculator.sumAfterDiscount(buySumm);
        Assertions.assertEquals(expectedSumm,resultSum);

    }
    @Test
    public void shouldGiveNoDiscountForValue1() {
        int buySumm = 1;
        int expectedSumm = 1;

        int resultSum = discountCalculator.sumAfterDiscount(buySumm);
        Assertions.assertEquals(expectedSumm,resultSum);
    }

    @Test
    public void shouldGiveNoDiscountForValue333() {
        int buySumm = 333;
        int expectedSumm = 333;

        int resultSum = discountCalculator.sumAfterDiscount(buySumm);
        Assertions.assertEquals(expectedSumm,resultSum);
    }

    @Test
    public void shouldGive2PercentDiscountForValue1000() {
        int buySumm = 1000;
        int expectedSumm = 980;

        int resultSum = discountCalculator.sumAfterDiscount(buySumm);
        Assertions.assertEquals(expectedSumm,resultSum);
    }

    @Test
    public void shouldGive2PercentDiscountForValue2000() {
        int buySumm = 2000;
        int expectedSumm = 1960;

        int resultSum = discountCalculator.sumAfterDiscount(buySumm);
        Assertions.assertEquals(expectedSumm,resultSum);
    }

}