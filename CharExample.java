public class CharExample {

	public static void main(String[] args) {
		char karakter = 'İ';
		
		char karakterLower = Character.toLowerCase(karakter);
		
		switch(karakterLower){
			case 'a':
			case 'ı':
			case 'o':
			case 'u': 
				System.out.println(karakter + " kalın ünlü.");
				break;
			default:
				System.out.println(karakter + " ince ünlü.");
				break;
		}
	}

}
