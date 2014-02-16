package communitykatas.learning.primes;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PrimeNumberTest {
	private PrimeCalculator calculator =  new PrimeCalculator();
	
	@Test
	public void shouldReturnTrueIfNumberIsDivisibleByItself() {
		assertThat(calculator.isPrime(2), is(true));
	}

	@Test
	public void shouldReturnFalseIfNumberIsLessThanOne(){
		assertThat(calculator.isPrime(0), is(false));
	}
}
