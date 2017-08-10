import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void onePlusOneShouldEqualsTwo(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.sum(1,1));
    }

    @Test
    public void oneMultiplyOneShouldEqualsTwo(){
        Calculator calculator2 = new Calculator();
        Assert.assertEquals(1, calculator2.multiply(1,1));
    }

    FizzBuzz testObject = new FizzBuzz();


    @Test
    public void shouldReturnEmptyArrayWhenZeroProvided(){
        Assert.assertArrayEquals(new String [0], testObject.fizzBuzz(0));
    }

    @Test
    public void shouldReturnArrayWithOnly1When1Provided(){
        Assert.assertArrayEquals(new String[]{"1"}, testObject.fizzBuzz(1));
    }

    @Test
    public void shouldReturnArrayWithOnly2When2Provided(){
        Assert.assertArrayEquals(new String[]{"1", "2"}, testObject.fizzBuzz(2));
    }

    @Test
    public void shouldReturnArrayWithOnlyFizzWhen3Provided(){
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz"}, testObject.fizzBuzz(3));
    }

    @Test
    public void shouldReturnArrayWithOnlyBuzzWhen5Provided(){
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, testObject.fizzBuzz(5));
    }

}
