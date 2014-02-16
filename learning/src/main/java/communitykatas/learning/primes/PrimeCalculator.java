package communitykatas.learning.primes;

public class PrimeCalculator {
	private static final int MIN_PRIME_BOUNDARY = 1;
	private PrimeStrategy[] primeCriteria = new PrimeStrategy[] { new IsLessThanOne(), new IsDivisibleByManyNumbers()};
	

	public Boolean isPrime(int value) {
		boolean isInvalid = false;
		for(PrimeStrategy strategy : primeCriteria) {
			isInvalid = isInvalid || strategy.evaluate(value);
		}
		
		return !isInvalid;
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

	public Boolean isComposite(int value) {
		return canDivideManyNumbersInto(value);
	}

}
