package _18Strings;
public class StringP1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=new String("Meet me at the clock tower");
		String[] arr=a.split(" ");
		for(int i=0; i<arr.length; i++) {
			int count=i%3;
			if(count==0) {
				arr[i]=percent(arr[i]);
			}else if(count==1) {
				arr[i]=hash(arr[i]);
			}
			else if(count==2) {
				arr[i]=arr[i].toUpperCase();
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static String percent(String a) {
		String c="aeiouAEIOU";
		String r="";
		for(int i=0; i<a.length(); i++) {
			char f=a.charAt(i);
			if(c.indexOf(f)!=-1){
				r+="%";
			}
			else {
				r+=a.charAt(i);
			}
		}
		return r;
	}
	public static String hash(String a) {
		String g="aeiouAEIOU";
		String r="";
		for(int i=0; i<a.length(); i++) {
			char j=a.charAt(i);
			if(g.indexOf(j)>=0) {
				r+="#";
			}
			else {
				r+=a.charAt(i);
			}
		}
		return r;
	}

}
