package tddbc;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class OpenRangeTest {
	// DONE 下端点と上端点を与えて閉区間を生成しよう
	// DONE 閉区間から下端点を取得しよう
	// DONE 閉区間から上端点を取得しよう
	// マイナス3_3を生成できることを取得しよう
	public static class  下端点と上端点を与えて閉区間を生成{

		@Test
		public void 開区間マイナス1_0を生成できること() throws Exception {
			new OpenRange(-1, 0);
		}

		@Test(expected=IllegalArgumentException.class)
		public void 開区間マイナス1_マイナス1を生成できないこと() throws Exception {
			new OpenRange(-1, -1);
		}


	}
}



