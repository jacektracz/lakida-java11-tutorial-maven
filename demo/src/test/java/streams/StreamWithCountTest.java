package streams;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class StreamWithCountTest {

	@Test
	public void shouldCountNumbersInTheList() throws Exception {
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5);
		
		long quantity = listOfNumbers
			.stream()
			.count();
		
		assertThat(quantity, equalTo(5L));
	}
	
}
