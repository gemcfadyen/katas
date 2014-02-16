package communitykatas.learning.primes;

public class PrimeCalculator {
	private static final int MIN_PRIME_BOUNDARY = 1;

	public Boolean isPrime(int value) {
		if (isLessThanOne(value)) {
			return false;
		} else if (canDivideManyNumbersInto(value)) {
			return false;
		} else {
			return true;
		}
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

	private boolean isLessThanOne(int number) {
		return number <= MIN_PRIME_BOUNDARY;
	}

	public Boolean isComposite(int value) {
		return canDivideManyNumbersInto(value);
	}

}
