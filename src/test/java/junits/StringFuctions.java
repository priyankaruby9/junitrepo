package junits;

public class StringFuctions {
	
	public static boolean ispalindrome(String str) {
			
		int start = 0;
		int end = str.length()-1;
		
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}		
			
}