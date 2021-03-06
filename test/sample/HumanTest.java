package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HumanTest {

	@Test
	public void test() {
		List<Human> list= new ArrayList<>();
		list.add(new Human(166,71));
		list.add(new Human(178,84));
		list.add(new Human(176,94));
		list.add(new Human(174,85));
		list.add(new Human(174,65));
		
		Human dummyBiggestGay = new Human(Integer.MAX_VALUE, Integer.MAX_VALUE);
		List<Human> resultsHumans = dummyBiggestGay.howManyHumanCanKatagurumaOnYou(list);
		assertThat(resultsHumans.size(), is(3));
		assertThat(resultsHumans.get(0).getWeight(), is(71));
		assertThat(resultsHumans.get(1).getWeight(), is(85));
		assertThat(resultsHumans.get(2).getWeight(), is(94));
	}

}
