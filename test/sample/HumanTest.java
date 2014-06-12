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
		
		Human dummy_human = new Human(0, 0);
		assertThat(dummy_human.teamKatagurumas(list).size(), is(2));
	}

}
