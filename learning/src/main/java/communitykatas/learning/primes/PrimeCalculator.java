package communitykatas.learning.primes;

public class PrimeCalculator {

	private static final int MIN_PRIME_BOUNDARY = 1;

	public Boolean isPrime(int value) {
		return isLessThanOne(value) ? false : true;
	}

	private boolean isLessThanOne(int number) {
		return number < MIN_PRIME_BOUNDARY;
	}

}
