package tddbc;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class CloseRangeTest {
	// DONE 下端点と上端点を与えて閉区間を生成しよう
	// DONE 閉区間から下端点を取得しよう
	// DONE 閉区間から上端点を取得しよう
	// DONE 閉区間から文字列表記を取得しよう
	public static class 下端点と上端点を与えて閉区間を生成して上端点と下端点を取得 {

		private CloseRange range;
		private CloseRange range4_9;

		@Before
		public void setUp() {
			this.range = new CloseRange(3, 8);
			this.range4_9 = new CloseRange(4, 9);
		}

		@Test
		public void 閉区間を作成して下端点を取得する() throws Exception {
			assertThat(range.getLowerEndPoint(), is(3));
		}

		@Test
		public void 閉区間4_9を作成して下端点を取得する() throws Exception {
			assertThat(range4_9.getLowerEndPoint(), is(4));
		}

		@Test
		public void 閉区間4_9を作成して上端点を取得する() throws Exception {

			assertThat(range4_9.getUpperEndPoint(), is(9));
		}

		@Test
		public void 閉区間4_9を作成して文字列を取得する() {
			assertThat(range4_9.toString(), is("[4,9]"));
		}
		@Test(expected=IllegalArgumentException.class)
		public void 区間8_3が生成できないことを確認する() throws Exception {
			new CloseRange(8,3);
//			try{
//				Range range8_3 = new Range(8,3);
//				fail("no exception");
//			}
//			catch (IllegalArgumentException e){
//
//			}
		}
		@Test
		public void 区間3_3が生成できることを確認する() throws Exception {
			new CloseRange(3,3);
		}
		@Test
		public void 区間0_3が生成できることを確認する() throws Exception {
			new CloseRange(0,3);
		}
		@Test
		public void 区間マイナス3_3が生成できることを確認する() throws Exception {
			new CloseRange(-3,3);
		}

	}

	public static class 閉区間が指定した整数を含むか判定 {

		private CloseRange range4_9;

		@Before
		public void setUp() {
			this.range4_9 = new CloseRange(4, 9);
		}

		// DONE 閉区間が指定した整数を含むか判定しよう

		@Test
		public void 閉区間4_9が4を含むことを確認する() {
			assertTrue(range4_9.contains(4));
		}

		@Test
		public void 閉区間4_9が9を含むことを確認する() {
			assertTrue(range4_9.contains(9));
		}

		@Test
		public void 閉区間4_9が3を含まないことを確認する() {
			assertFalse(range4_9.contains(3));
		}

		@Test
		public void 閉区間4_9が10を含まないことを確認する() {
			assertFalse(range4_9.contains(10));
		}
		@Test
		public void 閉区間4_9がマイナス10を含まないことを確認する() {
			assertFalse(range4_9.contains(-10));
		}

	}
	//DONE  閉区間が別の閉区間と等しいか判別しよう
	public static class 閉区間が別の閉区間と等しいか判別 {
		private CloseRange range4_9;
		private CloseRange rangeMinus3_5;
		@Before
		public void setUp() {
			this.range4_9 = new CloseRange(4, 9);
			this.rangeMinus3_5 = new CloseRange(-3,5);
		}

		@Test
		public void 閉区間4_9が4_9と等しいことを確認する() {
			assertTrue(range4_9.equals(new CloseRange(4, 9)));

		}

		@Test
		public void 閉区間4_9が4_10と等しくないことを確認する() {
			assertFalse(range4_9.equals(new CloseRange(4, 10)));
		}

		@Test
		public void 閉区間4_9が4_6と等しくないことを確認する() {
			assertFalse(range4_9.equals(new CloseRange(4,6)));
		}

		@Test
		public void 閉区間4_9が3_9と等しくないことを確認する() {
			assertFalse(range4_9.equals(new CloseRange(3, 9)));
		}
		@Test
		public void 閉区間4_9が6_9と等しくないことを確認する() {
			assertFalse(range4_9.equals(new CloseRange(6, 9)));
		}

		@Test
		public void 閉区間マイナス3_5がマイナス3_5と等しいことを確認する() {
			assertTrue(rangeMinus3_5.equals(new CloseRange(-3, 5)));
		}

	}

	// DONE 閉区間が別の閉区間と接続しているか判定しよう
	public static class 閉区間が別の閉区間と接続しているか判定 {

		private CloseRange range4_9;

		@Before
		public void setUp() {
			this.range4_9 = new CloseRange(4, 9);
		}

		@Test
		public void 閉区間4_9が閉区間9_11と接続していることを確認する() throws Exception {
			assertTrue(range4_9.isConnectedTo(new CloseRange(9, 11)));
		}

		@Test
		public void 閉区間4_9が閉区間1_4と接続していることを確認する() throws Exception {
			assertTrue(range4_9.isConnectedTo(new CloseRange(1, 4)));
		}

		@Test
		public void 閉区間4_9が閉区間10_12と接続していないことを確認する() throws Exception {
			assertFalse(range4_9.isConnectedTo(new CloseRange(10, 12)));
		}

		@Test
		public void 閉区間4_9が閉区間3_10と接続していることを確認する() throws Exception {
			assertTrue(range4_9.isConnectedTo(new CloseRange(3, 10)));
		}

		@Test
		public void 閉区間4_9が閉区間1_3と接続していないことを確認する() throws Exception {
			assertFalse(range4_9.isConnectedTo(new CloseRange(1, 3)));
		}

		@Test
		public void 閉区間4_9が閉区間5_8と接続していることを確認する() throws Exception {
			assertTrue(range4_9.isConnectedTo(new CloseRange(5, 8)));
		}

		@Test
		public void 閉区間4_9が閉区間マイナス1_5と接続していることを確認する() throws Exception {
			assertTrue(range4_9.isConnectedTo(new CloseRange(-1, 5)));
		}
		@Test
		public void 閉区間4_9が閉区間マイナス4_9と接続していることを確認する() throws Exception {
			assertTrue(range4_9.isConnectedTo(new CloseRange(4, 9)));
		}
	}
}



