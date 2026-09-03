import java.util.Scanner;
public class PalindromeSubString {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = scanner.next();
		
		
		PrintSubString(s);
        scanner.close();
		
	}

	private static void PrintSubString(String S) {
		
		for(int size =1; size<=S.length(); size++) {
			for(int i=0; i<=S.length()-size; i++) {
				String t = "";
				for(int j=i; j<i+size; j++) {
					t = t + S.charAt(j);
				}
				if(isPalindrome(t)) {
					System.out.println(t);
					return;
				}
			}
		}
		
	}

	private static boolean isPalindrome(String t) {
		
		int i=0;
		int j=t.length()-1;
		while(i<j) {
			
			if(t.charAt(i) == t.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}

}
