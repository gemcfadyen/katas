package communitykatas.learning.primes;

public class IsDivisibleByManyNumbers implements PrimeStrategy {

	public boolean evaluate(int number) {
		return canDivideManyNumbersInto(number);
	}
	private boolean canDivideManyNumbersInto(int value) {
		boolean isDivisibleBySeveralNumbers = false;
		for (int i = MIN_PRIME_BOUNDARY + 1; i < value; i++) {
			if (!isDivisibleByManyNumbers(value, i)) {
				isDivisibleBySeveralNumbers = true;
			}
		}
		return isDivisibleBySeveralNumbers;
	}

	private boolean isDivisibleByManyNumbers(int value, int i) {
		return value % i > 0;
	}

}
