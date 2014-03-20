package communitykatas.learning.tennis;

public class Game {
	private Score score;

	Game() {
		score = new Score();
	}
	
	public void playerOneScores() {
		score.incrementPlayerOneScore();
	}
	
	public String displayScore() {
		return score.display();
	}
	
	public void playerTwoScores() {
		score.incrementPlayerTwoScore();
	}
}
