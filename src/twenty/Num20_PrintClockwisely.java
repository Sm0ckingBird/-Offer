package twenty;

public class Num20_PrintClockwisely {
	
	public static void PrintClockwisely(int[][] numbers) {
		if(numbers == null || numbers.length == 0 || numbers[0].length == 0)
			return;
		
		int total = numbers.length * numbers[0].length;
		int[] result = new int[total];
		int y_top_border = numbers.length - 1;
		int x_right_border = numbers[0].length - 1;
		int y_bottom_border = 0;
		int x_left_border = 0;
		int[][] speed = new int[][] {new int[] {1,0},new int[] {0,1}
						,new int[] {-1,0},new int[] {0,-1}};
		int cur_state = 0;
		//用于记录现在的坐标
		int x = 0, y = 0;
		
		for(int i = 0; i < total; i++) {
			result[i] = numbers[y][x];
			
			switch(cur_state) {
				case 0:
					//发生碰撞
					if(x == x_right_border) {
						y_bottom_border++;
						cur_state = 1;
					}
					break;
				case 1:
					if(y == y_top_border) {
						x_right_border--;
						cur_state = 2;
					}
					break;
				case 2:
					if(x == x_left_border) {
						y_top_border--;
						cur_state = 3;
					}
					break;
				case 3:
					if(y == y_bottom_border) {
						x_left_border--;
						cur_state = 0;
					}
					break;
			}
			
			x += speed[cur_state][0];
			y += speed[cur_state][1];
		}
		
		for(int item: result)
			System.out.print(item + "->");
		System.out.println("end");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] numbers = new int[4][4];
		int[] r1 = new int[] {1,2,3,4};
		int[] r2 = new int[] {5,6,7,8};
		int[] r3 = new int[] {9,10,11,12};
		int[] r4 = new int[] {13,14,15,16};
		numbers[0] = r1;
		numbers[1] = r2;
		numbers[2] = r3;
		numbers[3] = r4;
		PrintClockwisely(numbers);
	}

}
