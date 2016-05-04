
public class While {
	
	public static void main(String[] args) {
		int count = 6;
	/*	while(count != 6) {
			System.out.println("Count value is " + count);
			count++;
		}
		
		count  = 6;
	do {
		System.out.println("Count value was " + count);
		count++;
		
		if(count>100){
			break;
		}
	} while(count !=6);*/
		
		int number = 5;
		int evenCount = 1;
		while(evenCount <6 ){
			if(!isEvenNumber(number, evenCount)) {
				number++;
			}
			if(evenCount==6){
				
				break;
				
			
			}
			
			System.out.println("Even number " + number);
	
			number++;
			evenCount++;
		}
		System.out.println("Found " + evenCount + " even numbers.");
		
	}
		public static boolean isEvenNumber(int number, int evenCount) {
			if((number % 2) == 0) {
				evenCount++;
				return true;
			} else {
				return false;
			}
			}
		}

