package communitykatas.learning.tennis;

public class ScoreStrategy implements TennisStrategy {
	private int playerOneScore;
	private int playerTwoScore;
	
	ScoreStrategy(int playerOneScore, int playerTwoScore) {
		this.playerOneScore = playerOneScore;
		this.playerTwoScore = playerTwoScore;
	}
	
	public String getScore() {
		TennisScoring[] points = TennisScoring.values();
		return points[playerOneScore] + ":" + points[playerTwoScore];
	}
}
