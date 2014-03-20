package communitykatas.learning.tennis;

public class WinnersStrategy implements TennisStrategy {
	private int playerOneScore;
	private int playerTwoScore;

	WinnersStrategy(int playerOneScore, int playerTwoScore) {
		this.playerOneScore = playerOneScore;
		this.playerTwoScore = playerTwoScore;
	}

	public String getScore() {

		if (onePlayerHasAtLeastFourPoints()
				&& playerHasTwoMorePointsThanTheOther()) {
			return "WINNER";
		} else {
			return "NONE";
		}

	}

	private boolean playerHasTwoMorePointsThanTheOther() {
		if (playerOneScore - playerTwoScore == 2 || playerTwoScore - playerOneScore == 2) {
			return true;
		} else {
			return false;
		}

	}

	private boolean onePlayerHasAtLeastFourPoints() {
		if(playerOneScore >=4 || playerTwoScore >= 4) {
		return true;
		} else {
			return false;
		}
		
	}

}
