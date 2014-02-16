package communitykatas.learning.primes;

public class IsLessThanOrEqualToOne implements PrimeStrategy {
	
	public boolean evaluate(int number) {
		return number <= MIN_PRIME_BOUNDARY;
	}

}
