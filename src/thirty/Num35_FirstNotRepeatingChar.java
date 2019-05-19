package thirty;

public class Num35_FirstNotRepeatingChar {
	
	//HashTable
	public static Character FirstNotRepeatingChar(String s) {
		char[] temp = new char[256];
		char[] chars = s.toCharArray();
		
		for(char item: chars)
			temp[item]++;
		
		for(char item: chars)
			if(temp[item] == 1)
				return item;
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FirstNotRepeatingChar("abaccdeff"));
	}

}
