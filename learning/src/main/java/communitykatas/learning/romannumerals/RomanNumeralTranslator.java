package communitykatas.learning.romannumerals;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralTranslator {
	private Map<String, Integer> romanNumeralMapping = new HashMap<String, Integer>();

	RomanNumeralTranslator() {
		romanNumeralMapping.put("I", 1);
		romanNumeralMapping.put("IV", 4);
		romanNumeralMapping.put("V", 5);
		romanNumeralMapping.put("X", 10);
		romanNumeralMapping.put("IX", 9);
		romanNumeralMapping.put("L", 50);
	}

	public int convert(String numeral) {
		int length = numeral.length();
		Integer total = decimalValueFor(numeral, 0);
		total = numeralMappingFound(total) ? total : 0;

		if (total != 0) {
			return total;
		} else {

			for (int i = 0; i < length; i++) {
				if (i < length) {
					Integer innerTotal = decimalValueFor(numeral, i);
					if (numeralMappingFound(innerTotal)) {
						total += innerTotal;
						break;
					} else {
						total += romanNumeralMapping.get(String.valueOf(numeral
								.charAt(i)));
					}
				}
			}
		}
		return total;

	}

	boolean numeralMappingFound(Integer value) {
		return value != null;
	}

	Integer decimalValueFor(String numeral, int i) {
		String nextNumeral = String.valueOf(numeral.substring(i));
		return romanNumeralMapping.get(nextNumeral);
	}

}
