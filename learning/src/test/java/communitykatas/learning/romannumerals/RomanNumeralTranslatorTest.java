package communitykatas.learning.romannumerals;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RomanNumeralTranslatorTest {
	private RomanNumeralTranslator romanNumerals = new RomanNumeralTranslator();
	private String romanNumeral;
	private Integer decimal;
	
	public RomanNumeralTranslatorTest(String romanNumeral, Integer decimal) {
		this.romanNumeral = romanNumeral;
		this.decimal = decimal;
	}

	@Parameters
	public static Collection<Object[]> setup() {
		Object[][] testData = new Object[][] {{"I",1}, {"V", 5}, {"X", 10}, 
											  {"II", 2}, {"III", 3}, {"IV", 4}, {"VII", 7}, 
											  {"XI", 11}, {"XIV", 14}, {"XVIII", 18}, {"XIX", 19}, {"XXIV", 24}, 
											  {"LXXIX", 79}, {"LXXXI", 81} };
		return Arrays.asList(testData);
	}

	@Test
	public void shouldConvertFromRomanNumeralToDecimal() {
		assertThat(romanNumerals.convert(romanNumeral), is(decimal));
	}
}






