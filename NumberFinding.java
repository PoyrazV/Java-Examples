
public class NumberFinding {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,6,5,8,7,4};
		int searching = 1;
		
		for(int i=0;i<numbers.length;i++) {
			if(searching == numbers[i]) {
				System.out.println(searching + " is in the array.");
			}
		}

	}

}
