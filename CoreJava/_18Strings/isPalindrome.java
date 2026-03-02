package _18Strings;
public class isPalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="malayala";
		char[] c=a.toCharArray();
		String rev="";
		for(int i=c.length-1; i>=0; i--) {
			rev+=c[i];
		}
		if(rev.equals(a)) {
			System.out.println(a+" is a palindrome");
		}else {
			System.out.println(a+" is not a plaindrome");
		}
	}
}
