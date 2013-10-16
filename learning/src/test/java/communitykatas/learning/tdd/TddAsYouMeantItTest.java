package communitykatas.learning.tdd;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/*
 * A game has fields that can be taken once and is over when all fields are taken
 */

public class TddAsYouMeantItTest {

	@Test
	public void shouldBeGameOverWhenAllFieldsAreTakenOnce() {
		Game game = new Game(2);
		game.takeMove(0, "x");
		game.takeMove(1, "x");
		assertThat(game.status(), equalTo("OVER"));
	}
	
	@Test
	public void shouldBeAnActiveGameIfNotAllFieldsAreTaken(){
		Game game = new Game(2);
		game.takeMove(0, "x");
		assertThat(game.status(), equalTo("ACTIVE"));
	}

	@Test
	public void shouldIndicateIfAFieldHasAlreadyBeenTaken() {
		Game game = new Game(2);
		game.takeMove(0, "x");
		assertFalse(game.isFieldFreeAt(0));
	}

	class Game {
		private Field[] fields;

		public Game(int numberOfFields) {
			fields = new Field[numberOfFields];

			for (int i = 0; i < numberOfFields; i++) {
				fields[i] = new Field("-");

			}
		}

		public boolean isFieldFreeAt(int i) {
			return (fields[i].getSymbol() == "-");
		}

		public String status() {
			for (Field field : fields) {
				if (field.getSymbol() == "-") {
					return "ACTIVE";
				}
			}
			return "OVER";
		}

		public void takeMove(int fieldIndex, String mark) {
			if (fields[fieldIndex].getSymbol() == "-") {
				fields[fieldIndex].setSymbol(mark);
			}
		}
	}

	class Field {
		String symbol;

		public Field(String move) {
			symbol = move;
		}

		public String getSymbol() {
			return symbol;
		}

		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}

	}
}
