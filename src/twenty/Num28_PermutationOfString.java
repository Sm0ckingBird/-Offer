package twenty;

public class Num28_PermutationOfString {
	
	//再加一个Set去重就好了
	public static void PermutationOfString(String s) {
		if(s == null || s.length() == 0)
			return;
		
		Permutation(s.toCharArray(), 0);
	}
	
	private static void Permutation(char[] choices, int index) {
		if(index == choices.length - 1)
			System.out.println(String.valueOf(choices));
		else {
			for(int i = index; i < choices.length; i++) {
				swap(choices,index,i);
				Permutation(choices,index+1);
				swap(choices,index,i);
			}
		}
	}
	
	private static void swap(char[] choices,int index1, int index2) {
		char temp = choices[index1];
		choices[index1] = choices[index2];
		choices[index2] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationOfString("abc");
	}

}
