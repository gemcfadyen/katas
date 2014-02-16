package communitykatas.learning.primes;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class IsDivisibleByManyNumbersStrategyTest {
	private PrimeStrategy divisbleByManyNumbers = new IsDivisibleByManyNumbers();
	
	@Test
	public void shouldReturnTrueIfValueIsDivisibleByManyNumbres() {
		assertThat(divisbleByManyNumbers.evaluate(6), is(true));
	}
	
	@Test
	public void shouldReturnFalseIfValueIsDivisbleOnlyByItself() {
		assertThat(divisbleByManyNumbers.evaluate(1), is(false));
	}
}
