package communitykatas.learning.tennis;

public class Score {
	private int playerOneScore;
	private int playerTwoScore;
	private TennisStrategy[] orderedScoringStrategies;

	public Score() {
		playerOneScore = 0;
		playerTwoScore = 0;
	}

	public String display() {
		setupScoringStrategies();
		String score = "NONE";
		for (int i = 0; i < orderedScoringStrategies.length && score == "NONE"; i++) {
			score = orderedScoringStrategies[i].getScore();
		}

		return score;

	}

	public void incrementPlayerOneScore() {
		playerOneScore++;
	}

	public void incrementPlayerTwoScore() {
		playerTwoScore++;
	}

	private void setupScoringStrategies() {
		TennisStrategy advantage = new AdvantageStrategy(playerOneScore, playerTwoScore);
		TennisStrategy deuce = new DeuceStrategy(playerOneScore, playerTwoScore);
		TennisStrategy gameScore = new ScoreStrategy(playerOneScore, playerTwoScore);
		TennisStrategy winnerStrategy = new WinnersStrategy(playerOneScore, playerTwoScore);

		orderedScoringStrategies = new TennisStrategy[] { winnerStrategy,
				advantage, deuce, gameScore };
	}
}
