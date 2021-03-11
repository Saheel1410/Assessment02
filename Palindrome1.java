package assesment_02;

public class Palindrome1 {

	public static void main(String[] args) {
		String str = "hannah";
		char[] palArray = str.toCharArray();
		for (int i = 0; i < palArray.length; i++) {
			for (int j = palArray.length-1; j >=0; j--) {
				if(palArray[i]==palArray[j]) {
					System.out.println("it is palindrome");
				}
				
			}
			
		}

	}

}
