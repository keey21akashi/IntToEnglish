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
	@Test
	public void 整数値30がthirtyと変換される() {
		IntToEng ite = new IntToEng();
		String expected = "thirty";
		String actual = ite.translateEng2(30);
		assertThat(actual, is(expected));
	}
	@Test
	public void 整数値34がthirtyfourと変換される() {
		IntToEng ite = new IntToEng();
		String expected = "thirty four";
		String actual = ite.translateEng2(34) +  " " + ite.translateEng(34);
		assertThat(actual, is(expected));
	}
	@Test
	public void 整数値12がtwelveと変換される() {
		IntToEng ite = new IntToEng();
		String expected = "twelve";
		String actual = ite.translateEng3(12);
		assertThat(actual, is(expected));
	}
	@Test
	public void 整数値100がonehundredと変換される() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred  ";
		String actual = ite.translateEng(100) +  " " + ite.translateEng4(100) +  " " + ite.translateEng2(100) +  " " + ite.translateEng(100%10);
		assertThat(actual, is(expected));
	}
	@Test
	public void 整数値234がonehundredと変換される() {
		IntToEng ite = new IntToEng();
		String expected = "two hundred thirty four";
		String actual = ite.translateEng(234) +  " " + ite.translateEng4(234) +  " " + ite.translateEng2(234) +  " " + ite.translateEng(234%10);
		assertThat(actual, is(expected));
	}
	

}
