package communitykatas.learning.primes;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class IsLessThanOrEqualToOneStrategyTest {
	private PrimeStrategy isLessThanOrEqualToOne = new IsLessThanOrEqualToOne();
	
	@Test
	public void shouldReturnTrueIfValueIsLessThanOne() {
		assertThat(isLessThanOrEqualToOne.evaluate(-5), is(true));
	}
	
	@Test
	public void shouldReturnTrueIfValueIsEqualToOne() {
		assertThat(isLessThanOrEqualToOne.evaluate(1), is(true));
	}
	
	@Test
	public void shouldReturnFalseIfValueIsBiggerThanOne() {
		assertThat(isLessThanOrEqualToOne.evaluate(5), is(false));
	}
}
