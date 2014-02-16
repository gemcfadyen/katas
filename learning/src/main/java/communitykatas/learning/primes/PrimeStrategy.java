package communitykatas.learning.primes;

public interface PrimeStrategy {
	int MIN_PRIME_BOUNDARY = 1;
	boolean evaluate(int number);
}
