package Question7;

public class CountWords {

	
	static int subStringCount(String string,String givenString) {
		
	
		int k;
		int count=0;
		int a =string.length();
		int b =givenString.length();
		for(int i=0;i<=b-a;i++) {
			for(k=0;k<a;k++) {
				if(givenString.charAt(i+k)!=string.charAt(k)) {
					break;
				}
			}
			if(k==a)
				count++;
		}
		return count;
	}
}
