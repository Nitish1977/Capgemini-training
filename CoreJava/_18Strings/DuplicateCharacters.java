package _18Strings;
public class DuplicateCharacters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="meet me at the apt apt apt";
		int[] freq=new int[256];
		char[] c=a.toCharArray();
		System.out.println("frequency of numbers: ");
		for(char i:c) {
			freq[i]++;
		}
		for(char i:c) {
			if(freq[i]!=0) {
				System.out.println(i+" = "+freq[i]);
				freq[i]=0;
			}
		}
		
		for(char i:c) {
			freq[i]++;
		}
		System.out.print("Duplicate characters: ");
		for(char i: c) {
			if(freq[i]!=0 && freq[i]!=1) {
				System.out.print(i+" ");
				freq[i]=0;
			}
		}
	}
}
