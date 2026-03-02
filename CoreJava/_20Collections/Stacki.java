package _20Collections;
import java.util.Stack;
import java.util.Scanner;
public class Stacki {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Stack<Character> st=new Stack<Character>();
		boolean g=true;
		for(char i:s.toCharArray()) {
			if(i=='('||i=='{'||i=='[') {
				st.push(i);
			}
			else {
				if(st.empty()) {
					g=false;
					break;
				}
				char top=st.pop();
				if(i==')' && top!='(') {
					g=false;
					break;
				}
				if(i==']' && top!='[') {
					g=false;
					break;
				}
				if(i=='}' && top!='{') {
					g=false;
					break;
				}
			}
		}
		if(st.empty()) {
			g=true;
		}else {
			g=false;
		}
		System.out.println(g);
	}
}
