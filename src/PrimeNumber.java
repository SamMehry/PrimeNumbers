
public class PrimeNumber {
	//2 is the lowest prime number
	//3 
	//num = 20
	
	
	public static boolean isPrimeNumber(int num) {
		
		//edge/corner cases: 
		if (num<=1) {
			return false;
		}
		for (int i=2; i<num; i++) {
			if(num%i== 0) {
				return false;
			}
		}
		return true; 
	}
	
	
	public static void getPrimeNumber(int num) {
		for(int i=2; i<=num; i++) {
			if(isPrimeNumber(i))
				System.out.print(i + " ");
				
		}
	}

	public static void main(String[] args) {

	System.out.println("is prime number: "+ isPrimeNumber(3));	

	
	
	getPrimeNumber(5);
	getPrimeNumber(4);
	getPrimeNumber(7);

		
	} 

}
