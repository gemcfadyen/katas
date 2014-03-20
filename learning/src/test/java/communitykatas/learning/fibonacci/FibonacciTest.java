package communitykatas.learning.fibonacci;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void shouldReturnTheFibonacciSequenceUpTo10() {
		assertThat(printFibonacciNumbers(10), is("0,1,1,2,3,5,8"));
	}

	@Test
	public void shouldReturnTheFibonacciSequenceUpTo100() {
		assertThat(printFibonacciNumbers(100),
				is("0,1,1,2,3,5,8,13,21,34,55,89"));
	}

	@Test
	public void shouldReturnTheFibonacciSequenceFor1() {
		assertThat(printFibonacciNumbers(1), is("0,1"));
	}

	@Test
	public void shouldReturnTheFibonacciSequenceFor0() {
		assertThat(printFibonacciNumbers(0), is("0"));
	}

	private String printFibonacciNumbers(int endPoint) {
		int firstNumber = 0;
		String sequence = "" + firstNumber;
		
		if (endPoint == 0) {
			return sequence;
		} else {
			int secondNumber = 1;
			sequence += "," + secondNumber;
		
			for (int i = 3; i <= endPoint; i++) {
				int sum = firstNumber + secondNumber;
				if (sum <= endPoint) {
					sequence += "," + sum;
					firstNumber = secondNumber;
					secondNumber = sum;
				}
			}
		}

		return sequence;

	}
}
