public class PerfectNumbers {
	public static void main(String[] args) {
		int sum=0,number=28;
		
		for(int i=1; i<number; i++){
			if(number%i == 0){
				sum = sum+i;
			}
		}
		if(sum == number) {
			System.out.println(number + " is a perfect number.");
		}
		else {
			System.out.println(number + " is not a perfect number.");
		}
	}
}
