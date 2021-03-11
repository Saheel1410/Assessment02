package assesment_02;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		
		
		String str = "hannah";
		String rev = "";
		char[] palArray = str.toCharArray();
		
		for (int i = palArray.length-1; i >=0; i--) {
			rev = rev+palArray[i]+"";
			//System.out.println(rev);
		}
		if(rev.equals(str)) {
			System.out.println("given string is a palindrome");
		}
		else {
			System.out.println("given string is not a palindrome");
		}
		
//		for (int i = 0; i < palArray.length; i++) {
//			for (int j = palArray.length-1; j >=0; j--) {
//				if(palArray[i]==palArray[j]) {
//					System.out.println("it is palindrome");
//				}
//				
//			}
//			
//		}

	}

}
