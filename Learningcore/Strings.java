package learn_java;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sandeep";
		String k = "kumar";
		String y = "yadav";
//		String d = "sandeep";
		String z = "hello".concat(s);
		String str = new String("sandeep");
		
		System.out.println(s+" "+k+" "+y+ " "+z);
		System.out.println();
		
		System.out.println("s and d both are same?: "+ s.equals(z)); // false
		System.out.println("s and d both are same?: "+ (s==z)); // false
		System.out.println("s and d both are same?: "+ s.equals(str)); // true
		System.out.println("s and d both are same?: "+ (s==str)); // false
		
		int l = s.length();// know the length of string
		
		System.out.println("length of string s : "+l);
		System.out.println("string s in Uppercase : "+ s.toUpperCase());
		System.out.println("string s in Lowercase: "+ s.toLowerCase());
		
		
	}

}
