package twenty;

public class Num24_ValidationOfBinarySearchTreePostOrder {
	
	public static boolean isValid(int[] postOrder,int start, int end) {
		
		if(postOrder == null)
			return false;
		if(postOrder.length == 0)
			return true;
		if(end == start)
			return true;
			
		int root = postOrder[end - 1];
		
		int right_start = 0;
		while(postOrder[right_start] < root && right_start <= end - 1)
			right_start++;
		
		for(int i = right_start + 1; i < end - 1; i++)
			if(postOrder[i] < root)
				return false;
		
		return isValid(postOrder,0,right_start) && isValid(postOrder,right_start,end - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isValid(new int[] {5,7,6,9,11,10,8},0,7);
		isValid(new int[] {7,4,6,5},0,4);
	}

}
