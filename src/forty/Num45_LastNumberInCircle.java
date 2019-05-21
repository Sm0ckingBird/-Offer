package forty;

public class Num45_LastNumberInCircle {
	
	//Classical
	public static int LastNumberInCircle(int n, int m) {
		if(n < 1 || m < 1)
			return -1;
		
		int[] circle = new int[n];
		for(int i = 0; i < n; i++)
			circle[i] = i;
		
		int anchor = 0;
		
		for(int j = 0; j < n - 1; j++) {
			int z = 0;
			while(true) {
				if(circle[anchor] != -1) {
					z++;
					if(z == m)
						break;
				}
				anchor = (anchor+1)%n;
			}
			
			
			circle[anchor] = -1;
		}
		
		for(int item: circle)
			if(item != -1)
				return item;
		
		return 0;
	}
	
	//Creative
	public static int LastNumberInCircle_Creative(int n, int m) {
		if(n < 1 || m < 1)
			return -1;
		
		int last = 0;
		for(int i = 2; i <= n; i++)
			last = (last + m) % i;
		
		return last;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LastNumberInCircle(5,4));
		System.out.println(LastNumberInCircle_Creative(5,4));
	}

}
