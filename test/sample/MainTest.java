package sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		PersonDTO dto = Main.method1("166 71");
		assertThat(dto.getHeight(), is(166));
		assertThat(dto.getWeight(), is(71));
	}

}
