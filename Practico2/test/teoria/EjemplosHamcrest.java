package teoria;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class EjemplosHamcrest {

	@Test
	public void test0() {
		List<Integer> list = Arrays.asList(5, 5, 2, 4);
		assertThat(list, hasSize(4));
		assertThat(list, contains(5, 5, 2, 4));
		assertThat(list, hasItems(2, 4));
		assertThat(list, hasItem(2));
		assertThat(list, containsInAnyOrder(2, 4, 5, 5));
		assertThat(list, everyItem(greaterThan(1)));
		assertThat(list, hasItem(greaterThan(4)));
	}


	@Test
	public void test1() {
		Set<Integer> s = new HashSet<Integer>();
		s.add(2);
		s.add(4);
		s.add(5);
		assertThat(s, contains(2, 4, 5));
	}


	@Test
	public void test2() {
		Integer [] arr = { 5, 5, 2, 4 };
		assertThat(arr, arrayWithSize(4));
		assertThat(arr, arrayContaining(5, 5, 2, 4));
		assertThat(arr, arrayContainingInAnyOrder(2, 4, 5, 5));
		assertThat(arr, hasItemInArray(5));
	}


	@Test
	public void test3() {
		assertThat("a" + "b", is("ab"));
		assertThat("a" + "b", equalTo("ab"));
	}


}
