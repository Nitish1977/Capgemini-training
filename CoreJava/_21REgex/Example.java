package _21REgex;
public class Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println("abc".matches("^abc$"));		//true
		System.out.println("xabc".matches("^abc$"));	//false
		System.out.println("abcx".matches("^abc$"));	//fakse
		System.out.println("xabcx".matches("^abc$"));	//false
		System.out.println(2);
		
		System.out.println("12345".matches("^\\d+$"));	//true
		System.out.println("123a".matches("^\\d+$"));	//false;
		System.out.println("12 3".matches("^\\d+$"));	//false
		System.out.println(3);
		
		System.out.println("color".matches("^colo?r$"));	//trwe
		System.out.println("colr".matches("^colo?r$"));		//true
		System.out.println("coloor".matches("^colo?r$"));	//false
		System.out.println(4);
		
		System.out.println("100".matches("\\d\\d?\\d"));	//true
		System.out.println("10".matches("\\d\\d?\\d"));		//true
		System.out.println("1".matches("\\d\\d?\\d"));		//false
		System.out.println(5);
		
		System.out.println("abc123".matches("\\w+"));		//true
		System.out.println("A_B9".matches("\\w+"));			//true
		System.out.println("abc-123".matches("\\w+"));		//false
		System.out.println(6);
		
		System.out.println("".matches("\\w*"));				//true
		System.out.println("Test_01".matches("\\w*"));		//true
		System.out.println("Test 01".matches("\\w*"));		//false
		System.out.println(7);
		
		System.out.println("User_123".matches("^\\w+$"));	//true
		System.out.println("User-123".matches("^\\w+$"));	//false
		System.out.println("User 123".matches("^\\w+$"));	//false
		System.out.println(8);
		
		System.out.println("abc_123".matches("\\w+")); 		//true
		System.out.println("abc_123".matches("[A-Za-z0-9_]+")); //true
		System.out.println(9);
		
		System.out.println("   ".matches("\\s+"));			//true
		System.out.println("\t\t".matches("\\s+"));			//true
		System.out.println(" ".matches("\\s+"));			//true
		System.out.println(" a ".matches("\\s+"));			//false
		System.out.println(10);
		
		System.out.println("".matches("\\s*"));				//true
		System.out.println("   ".matches("\\s*"));			//true
		System.out.println(" a ".matches("\\s*"));			//false
		System.out.println(11);
			
		System.out.println("   ".matches("^\\s+$"));		//true
		System.out.println(" \t ".matches("^\\s+$"));		//true
		System.out.println(" a ".matches("^\\s+$"));		//false
		System.out.println(12);
		
		System.out.println("1234".matches("\\d{4}"));		//true
		System.out.println("123".matches("\\d{4}"));		//false
		System.out.println("12345".matches("\\d{4}"));		//false
		System.out.println(13);
		
		System.out.println("ABC".matches("[A-Z]{3}"));		//true
		System.out.println("AB".matches("[A-Z]{3}"));		//false
		System.out.println("ABCD".matches("[A-Z]{3}"));		//false
		System.out.println(14);
		
		System.out.println("abcabc".matches("(abc){2}"));	//true
		System.out.println("abc".matches("(abc){2}"));		//false
		System.out.println(15);
		
		System.out.println("9999".matches("^\\d{4}$"));		//true
		System.out.println("99a9".matches("^\\d{4}$"));		//false
		System.out.println("999".matches("^\\d{4}$"));		//false
		System.out.println(16);
		
		System.out.println("123".matches("\\d{3,5}"));		//true
		System.out.println("12345".matches("\\d{3,5}"));	//true
		System.out.println("12".matches("\\d{3,5}"));		//false
		System.out.println("123456".matches("\\d{3,5}"));	//fakse
		System.out.println(17);
		
		System.out.println("ABCD".matches("[A-Z]{2,5}"));	//true
		System.out.println("AB".matches("[A-Z]{2,5}"));		//true
		System.out.println("ABCDE".matches("[A-Z]{2,5}"));	//true
		System.out.println("A".matches("[A-Z]{2,5}"));		//false
		System.out.println(18);
		
		System.out.println("abcabc".matches("(abc){2,3}"));	//true
		System.out.println("abcabcabc".matches("(abc){2,3}"));//true
		System.out.println("abc".matches("(abc){2,3}"));		//false
		System.out.println(19);
		
		System.out.println("9876543210".matches("^[6-9]\\d{9,10}$")); 	//true
		System.out.println("987654321".matches("^[6-9]\\d{9,10}$"));	//false
		System.out.println(20);
		
		System.out.println("cat".matches("^(cat|dog)$"));		//true
		System.out.println("dog".matches("^(cat|dog)$"));		//true
		System.out.println("catdog".matches("^(cat|dog)$"));	//false
		System.out.println(21);
		
		System.out.println("A".matches("[A-Z]|[a-z]"));			//true
		System.out.println("a".matches("[A-Z]|[a-z]"));			//true
		System.out.println("1".matches("[A-Z]|[a-z]"));			//false
		System.out.println(22);
		
		System.out.println("123".matches("\\d+|[A-Z]+"));		//true
		System.out.println("ABC".matches("\\d+|[A-Z]+"));		//true
		System.out.println("A1".matches("\\d+|[A-Z]+"));		//false
		System.out.println(23);
		
		System.out.println("Mr".matches("(Mr|Mrs|Ms)"));		//true
		System.out.println("Mrs".matches("(Mr|Mrs|Ms)"));		//true
		System.out.println("Ms".matches("(Mr|Mrs|Ms)"));		//true
		System.out.println("Dr".matches("(Mr|Mrs|Ms)"));		//false
		System.out.println(24);
		
		System.out.println("UPI".matches("^(UPI|CASH|CARD)$"));	//true
		System.out.println("NET".matches("^(UPI|CASH|CARD)$"));	//false
	}
}
