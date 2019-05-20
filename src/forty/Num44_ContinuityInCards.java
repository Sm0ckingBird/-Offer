package forty;

import java.util.Arrays;

public class Num44_ContinuityInCards {
	
	public static boolean isContinuous(int[] cards) {
		if(cards.length != 5)
			return false;
		else {
			
			Arrays.sort(cards);
			
			if(cards[0] != 0) {
				int cur = cards[0];
				for(int i = 1; i < 5; i++)
					if(cards[i] != ++cur)
						return false;
			}
			else {
				int king = 1;
				if(cards[1] == 0)
					king = 2;
				
				int cur = cards[king];
				for(int i = king + 1; i < 5; i++) {
					if(cards[i] != cur + 1) {
						if(cards[i] == cur)
							return false;
						int diff = cards[i] - cur - 1;
						king -= diff;
						cur = cards[i];
						if(king < 0)
							return false;
					}
					else
						cur++;
				}
			}
			
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isContinuous(new int[] {0,0,1,1,5}));
	}

}
