package _18Strings;
public class VowelsConsonants {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="meet me at the apt apt apr";
		String x="aeiouAEIOU";
		char[] d=a.toCharArray();
		int v=0;
		int con=0;
		for(char i:d) {
			if(x.indexOf(i)!=-1) {
				v++;
			}
			else if(x.indexOf(i)==-1 && i!=' ') {
				con++;
			}
		}
		System.out.println("no of vowels: "+v);
		System.out.println("no of consonants: "+con);
	}
}
