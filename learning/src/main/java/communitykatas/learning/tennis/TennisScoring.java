package communitykatas.learning.tennis;

public enum TennisScoring {
	LOVE(0), FIFTEEN(1), THIRTY(2), FORTY(3), DEUCE(), ADVANTAGE();

	private int points;

	TennisScoring() {

	}

	TennisScoring(int points) {
		this.points = points;
	}

	public int getPoints() {
		return points;
	}

}
