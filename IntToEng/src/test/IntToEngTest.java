package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import inttoeng.IntToEng;

public class IntToEngTest {
	@Test
	public void 整数値0がzeroと変換される() {
		IntToEng ite = new IntToEng();
		String expected = "zero";
		String actual = ite.translateEng(0);
		assertThat(actual, is(expected));
	}
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
	public void 整数値100がone_hundredと変換される() {//100の倍数
		IntToEng ite = new IntToEng();
		String expected = "one hundred";
		String actual = ite.translateEng(100) + " " + ite.translateEng4(100);
		assertThat(actual, is(expected));
	}
	@Test
	public void 整数値314がthree_hundred_and_fourteenと変換される() {//下２桁が10~19
		IntToEng ite = new IntToEng();
		String expected = "three hundred and fourteen";
		String actual = ite.translateEng(314) + " " + ite.translateEng4(314) + " and " + ite.translateEng3(314);
		assertThat(actual, is(expected));
	}
	@Test
	public void 整数値234がtwo_hundred_and_thirty_fourと変換される() {//上記以外の3桁
		IntToEng ite = new IntToEng();
		String expected = "two hundred and thirty four";
		String actual = ite.translateEng(234) +  " " + ite.translateEng4(234) +  " and " + ite.translateEng2(234) +  " " + ite.translateEng(234%10);
		assertThat(actual, is(expected));
	}
	@Test
	public void 整数値2000がtwo_thousandと変換される() {
		IntToEng ite = new IntToEng();
		String expected = "two thousand";
		String actual = ite.translateEng(2000) + " " + ite.translateEng5(2000);
		assertThat(actual, is(expected));
	}

}

