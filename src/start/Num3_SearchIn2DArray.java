package start;

public class Num3_SearchIn2DArray {
	
	//从右上角或者坐下角开始搜寻
	//pass
	
	public static boolean Find(int[][] matrix, int rows, int columns, int number) {
		
		if(matrix == null || rows < 1 || columns < 1)
			return false;
		
		int r = 0;
		int col = columns - 1;
		int cur = 0;
		
		
		while(true) {
			cur = matrix[r][col];
			if(cur == number)
				return true;
			else if(cur > number)
				col--;
			else
				r++;
			if(r == rows || col == -1)
				return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
