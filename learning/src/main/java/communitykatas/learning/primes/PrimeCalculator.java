package communitykatas.learning.primes;

public class PrimeCalculator {
	private PrimeStrategy[] primeCriteria = new PrimeStrategy[] { new IsLessThanOrEqualToOne(), new IsDivisibleByManyNumbers()};

	public Boolean isPrime(int value) {
		boolean isInvalid = false;
		for(PrimeStrategy strategy : primeCriteria) {
			isInvalid = isInvalid || strategy.evaluate(value);
		}
		
		return !isInvalid;
	}

	public Boolean isComposite(int value) {
		return !isPrime(value);
	}

}
