package Code_69;

public class Solution {
	public int mySqrt(int x) {
		  if(x <= 1) {
			  return x;
		  } 
		  int l = 0;
		  int r = x;
		  int m = 0;
		  while(l <= r) {
			  m = l + (r -l) / 2;
			  if(x / m < m) {
				  r = m - 1;
			  } else if(x / m > m ) {
				  l = m + 1;
			  } else {
				  return m;
			  }
		  }
		  return r;
	  }
}
