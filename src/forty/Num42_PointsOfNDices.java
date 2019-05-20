package forty;

import java.util.ArrayList;
import java.util.List;

public class Num42_PointsOfNDices {
	
	//基于递归的代码,时间开销比较大
	public static void pointsOfNDices_Permutation(int n) {
		List<int[]> events = new ArrayList<int[]>();
		int [] temp = new int[n];
		for(int i = 0; i < 6; i++) {
			temp[0] = i+1;
			pointOfNDices(n,1,events,temp);
		}
		int[] scores = new int[n*6-n+1];
		for(int i = 0; i < events.size(); i++) {
			int sum = 0;
			for(int item: events.get(i))
				sum += item;
			scores[sum-n]++;
		}
		
		for(int i = 0; i < scores.length; i++)
			System.out.println(i+n+":"+((double)scores[i]/Math.pow(6, n)));
	}
	
	private static void pointOfNDices(int n,int cur, List<int[]> events, int[] temp) {
		if(n == cur) {
			int[] numbers = new int[n];
			for(int i = 0; i < n; i++)
				numbers[i] = temp[i];
			events.add(numbers);
		}
		else {
			for(int i = 0; i < 6; i++) {
				temp[cur] = i + 1;
				pointOfNDices(n,cur+1,events,temp);
			}
		}
	}

	//基于循环的思路
	public static void pointsOfNDices_Iteration(int n) {
		int[] prev = new int[] {1,1,1,1,1,1};
		int[] cur = null;
		
		for(int i = 1; i < n; i++) {
			cur = new int[5*(i+1)+1];
			
			for(int j = 0; j < cur.length; j++) {
				int start = j - 5 > 0? j - 5 : 0;
				int end = j > prev.length - 1? prev.length - 1 : j;
				cur[j] = partSum(prev,start,end);
			}
			
			prev = cur;
		}
		
		for(int i = 0; i < cur.length; i++)
			System.out.println(i+n+":"+((double)cur[i]/Math.pow(6, n)));
		
	}
	
	private static int partSum(int[] numbers,int start, int end) {
		if(end >= start) {
			int sum = 0;
			for(int i = start; i <= end; i++)
				sum += numbers[i];
			return sum;
		}
		else
			return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pointsOfNDices_Permutation(3);
		pointsOfNDices_Iteration(3);
	}

}
