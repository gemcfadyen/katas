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
	public void shouldReturnFalseIfNumberIsOneOrLess(){
		assertThat(calculator.isPrime(1), is(false));
	}
	
	@Test
	public void shouldReturnFalseIfNumberIsDivisibleByMoreThanJustItselfAndOne() {
		assertThat(calculator.isPrime(6), is(false));
	}
	
	@Test
	public void shouldReturnTrueIfNumberIsDivisibleByMoreThanJustItselfAndOne() {
		assertThat(calculator.isComposite(6), is(true));
	}
	
	@Test
	public void shouldReturnFalseIfNumberIsPrime() {
		assertThat(calculator.isComposite(17), is(false));
	}
}
