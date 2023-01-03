package learn_java;

public class ArraySearchCharacter {
	public static void main(String[] args) {
		
		String str[] = {"san", "sev", "kdl", "ef", "uji"};
		String[] match=new String[str.length];
		String k = "a";
		int counter=0;
		for(int i=0; i<str.length; i++) {
			
			for(int j=0; j<=i; j++) {
				
				if(str[i]==k) {
//					match[counter++]=str[i];
//					match.push(str[i]);
					break;
				}
					
			}
		}
	}
}
