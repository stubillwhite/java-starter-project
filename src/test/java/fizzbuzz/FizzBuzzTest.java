package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fooThenReturnsTwentyThree() {
        final FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals(fizzBuzz.foo(), 23);
    }
}
