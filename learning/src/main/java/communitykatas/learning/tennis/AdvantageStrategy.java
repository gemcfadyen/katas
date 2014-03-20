package communitykatas.learning.tennis;

public class AdvantageStrategy implements TennisStrategy {
	private int playerOneScore;
	private int playerTwoScore;
	
	AdvantageStrategy(int playerOneScore, int playerTwoScore) {
		this.playerOneScore = playerOneScore;
		this.playerTwoScore = playerTwoScore;
	}

	public String getScore() {
		if (playerOneScore >= 3 && playerTwoScore >= 3
				&& onePlayerHasOneMorePointThanTheOther()) {
			return TennisScoring.ADVANTAGE.toString();
		}
		return "NONE";
	}

	private boolean onePlayerHasOneMorePointThanTheOther() {
		if (playerOneScore - playerTwoScore == 1
				|| playerTwoScore - playerOneScore == 1) {
			return true;
		}
		return false;
	}
}
