public class Prime {

	public static void main(String[] args) {
		int number = 93;
		boolean prime = true;
		
		if(number < 1) {
			System.out.println("Improper input.");
		}
		else if(number == 1) {
			System.out.println("1 is not a prime number.");
		}
		
		else {	
			for(int i=2; i<number; i++){
				if(number%i == 0) {
					prime = false;
				}
			}
			if(prime == true) {
				System.out.println(number + " is a prime number.");
			}
			else {
				System.out.println(number + " is not a prime number.");
			}
		}

	}

}
