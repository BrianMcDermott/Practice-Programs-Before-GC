

public class ArrayCopyDemo {
	public static void main(String[] args) {
		char[] copyFrom = { 'm', 'i', 'l', 'k', 's', 'h', 'a', 'k', 'e' };
		
		char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 0, 9);
		
		System.out.println(new String(copyTo));
		}
	}


