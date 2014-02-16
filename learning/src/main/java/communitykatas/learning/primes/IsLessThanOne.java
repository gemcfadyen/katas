package communitykatas.learning.primes;

public class IsLessThanOne implements PrimeStrategy {
	
	public boolean evaluate(int number) {
		return number <= MIN_PRIME_BOUNDARY;
	}

}
