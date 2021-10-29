package Code_118;

import java.util.ArrayList;
import java.util.List;

/**
 * 打印杨辉三角
 * @author guofeng
 *
 */
public class Solution {
	public static List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> lists = new ArrayList<>();
		 for(int i = 1; i <= numRows; i ++) { // 第n层
			 for(int j = i; j > 0; j --) {
				 lists.add(new ArrayList<>(i));
			 }
		 }
		 return lists;
    }
	public static void main(String[] args) {
		List list = generate(4);
	
	}
}
