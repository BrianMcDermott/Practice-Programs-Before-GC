
public class Main {

	public static void main(String[] args) {
		/*int value = 1;
		if(value == 1) {
			System.out.println("Value was 1");
		} else if(value == 2) {
			System.out.println("Value was 2");
		} else { 
			System.out.println("Was not 1 or 2");
		}
		
		int switchValue = 3;
		
		switch(switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;
		case 2:
			System.out.println("Value was 2");
			break;
			
		case 3:case 4:case 5:
			System.out.println("Either 3, 4 or 5");
			System.out.println("Actually it was a " + switchValue);
			break;
			
		default:
			System.out.println("Was not 1 or 2");
			break;*/
		
		char switchChar= '1';
		
		switch(switchChar) {
		case 'A':
			System.out.println("This is an A");
			break;
			
		case 'B':
			System.out.println("This is a B");
			break;
		case 'C':
			System.out.println("This is a C");
			break;
		case 'D':
			System.out.println("This is a D");
			break;
		case 'E':
			System.out.println("Must be an E then");
			break;
		default:
			System.out.println("Letter not found, what is a " + switchChar);
			break;
		}
		
		String month = "january";
		switch(month.toUpperCase()) {
		case "JANUARY":
			System.out.println("Jan");
			break;
		case "JUNE":
			System.out.println("Jun");
			break;
			default:
				System.out.println("Not sure");
		}
	}

}
