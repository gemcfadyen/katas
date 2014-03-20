package communitykatas.learning.binarySearch;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
	private List<Integer> sortedList = new ArrayList<Integer>();

	@Before
	public void setup() {
		sortedList.add(1);
		sortedList.add(3);
		sortedList.add(4);
		sortedList.add(6);
		sortedList.add(8);
		sortedList.add(9);
		sortedList.add(11);
	}

	@Test
	public void shouldReturnTheIndexOf2() {
		Collections.sort(sortedList);
		assertThat(findIndexOf(4), is(2));
	}

	@Test
	public void shouldReturnTheIndexOf6() {
		Collections.sort(sortedList);
		assertThat(findIndexOf(6), is(3));
	}

	private Integer findIndexOf(int valueToFind) {
        List<Integer> originalList = sortedList; 
		while (sortedList.size() > 0) {
			int middleValue = getMiddleValueOfList();
			if (sortedList.get(middleValue) == valueToFind) {
				return originalList.indexOf(valueToFind);
			} else if (sortedList.get(middleValue) > valueToFind) {
				sortedList = searchForIndexInLowerList(middleValue);
			} else if(sortedList.get(middleValue) < valueToFind ){
				sortedList = searchForIndexInUpperList(middleValue);
			}
			
		}
		return -1;
	}

	private List<Integer> searchForIndexInUpperList(int middleValue) {
		return sortedList.subList(middleValue, sortedList.size());
	}

	private List<Integer> searchForIndexInLowerList(int endPoint) {
		return sortedList.subList(0, endPoint);
	}

	private int getMiddleValueOfList() {
		return sortedList.size() / 2;

	}
}
