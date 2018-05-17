package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import inttoeng.IntToEng;

public class IntToEngTest {

	@Test
	public void 整数値１がoneと変換される() {
		IntToEng ite = new IntToEng();
		String expected = "one";
		String actual = ite.translateEng(1);
		assertThat(actual, is(expected));
	}

}
