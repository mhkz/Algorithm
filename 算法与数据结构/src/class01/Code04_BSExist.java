package class01;

/**
 * 二分查找法
 * @author guofeng
 *
 */
public class Code04_BSExist {
	public static boolean exist(int[] sortArr, int num) {
		if(sortArr == null || sortArr.length == 0) {
			return false;
		}
		
		int L = 0;
		int R = sortArr.length - 1;
		int mid = 0;
		
		while(L < R) {
			mid = L + (( R - L) >> 1); // (L + R) / 2
			if(sortArr[mid] == num) {
				return true;
			} else if(sortArr[mid] < num) {
				L = mid + 1;
			} else {
				R = mid - 1;
			}
		}
		return sortArr[L] == num;
	}
}
