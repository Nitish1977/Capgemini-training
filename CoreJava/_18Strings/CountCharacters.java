package _18Strings;
public class CountCharacters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="meet me teh !appt# appt appt";
		char[] x=a.toCharArray();
		int count=0;
		for(char f: x) {
			if(f!=' ') {
				count++;
			}
		}
		System.out.println("no of characters: "+count);
		String z="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int c=0;
		for(char f: x) {
			if(z.indexOf(f)!=-1) {
				c++;
			}
		}
		System.out.println("no of letter: "+c);
	}
}
