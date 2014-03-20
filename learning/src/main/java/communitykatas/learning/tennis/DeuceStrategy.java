package communitykatas.learning.tennis;

public class DeuceStrategy implements TennisStrategy {

	private int playerOneScore;
	private int playerTwoScore;
	
	public DeuceStrategy(int playerOneScore, int playerTwoScore) {
		this.playerOneScore = playerOneScore;
		this.playerTwoScore = playerTwoScore;
	}
	
	public String getScore() {
		if(playerOneScore == playerTwoScore && playerOneScore >= 3) {
			return TennisScoring.DEUCE.toString();
		}
		else {
			return "NONE";
		}
	}
	
}
