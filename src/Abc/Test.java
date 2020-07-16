package Abc;

import java.util.StringTokenizer;

class GetToken{
	String s[];
	public String getToken(int index,String str) {
		StringTokenizer fenxi = new StringTokenizer(str);
		int num = fenxi.countTokens();
		s = new String[num+1];
		int k = 1;
		while(fenxi.hasMoreTokens()) {
			String temp = fenxi.nextToken();
			s[k] = temp;
			k++;
		}
		if(index <= num) {
			return s[index];
		}else {
			return null;
		}
	}
}

public class Test{	
	
	public static void main(String[] args) {
		String str = "I love this game";
		GetToken token = new GetToken();
		String s1 = token.getToken(2, str);
		String s2 = token.getToken(4, str);
		System.out.println(s1+":"+s2);
	}
}



