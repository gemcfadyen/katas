package communitykatas.learning.tennis;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TennisTest {
	@Test
	public void whenATennisGameStartsTheScoreIsLoveLove() {
		Game tennisGame = new Game();
		assertThat(tennisGame.displayScore(), is("LOVE:LOVE"));

	}

	@Test
	public void whenATennisPlayerScoresAPointItIsDisplayedOnTheScoreBoard() {
		Game tennisGame = new Game();
		tennisGame.playerOneScores();

		assertThat(tennisGame.displayScore(), is("FIFTEEN:LOVE"));
	}

	@Test
	public void whenEachPlayerScoresAPointTheDisplayShowsFifteenFifteen() {
		Game tennisGame = new Game();
		tennisGame.playerOneScores();
		tennisGame.playerTwoScores();

		assertThat(tennisGame.displayScore(), is("FIFTEEN:FIFTEEN"));
	}

	@Test
	public void whenScoresAreThreeAllTheScoreIsDeuce() {
		Game tennisGame = new Game();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();

		tennisGame.playerTwoScores();
		tennisGame.playerTwoScores();
		tennisGame.playerTwoScores();

		assertThat(tennisGame.displayScore(), is("DEUCE"));
	}

	@Test
	public void whenScoresAreOverThreeForEachPlayerAndPlayerOneIsOnePointAheadTheScoreIsAdvantage() {
		Game tennisGame = new Game();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();

		tennisGame.playerTwoScores();
		tennisGame.playerTwoScores();
		tennisGame.playerTwoScores();

		assertThat(tennisGame.displayScore(), is("ADVANTAGE"));
	}

	@Test
	public void whenPlayerHasAtLeastFourPointsAndAndTwoPointsMoreThanOpponentTheyWin() {
		Game tennisGame = new Game();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();

		tennisGame.playerTwoScores();
		tennisGame.playerTwoScores();

		assertThat(tennisGame.displayScore(), is("WINNER"));
	}
}
