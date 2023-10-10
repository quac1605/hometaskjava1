package hometask.one;

public class controlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Prime Number 
		int nValue = 50;
		
		jump: for(int i = 2; i <= nValue; i++) {
			if ((i == 2) || (i==3)) {
				System.out.println(i);	
			}
			int sqrt_i = (int) Math.sqrt(i);
			for (int j = sqrt_i; j < i; j++) {
				if (i%j==0) {
					continue jump; 
				}
				
			}
			 
			System.out.println(i);	
		}
		
		
		
	}

}
