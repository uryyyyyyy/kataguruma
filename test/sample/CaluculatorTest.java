package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CaluculatorTest {

	@Test
	public void test() {
		List<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(new PersonDTO(166,71));
		list.add(new PersonDTO(178,84));
		list.add(new PersonDTO(176,94));
		list.add(new PersonDTO(174,85));
		list.add(new PersonDTO(174,65));
		
		int moke = Caluculator.method(list);
		assertThat(moke, is(3));
	}

}