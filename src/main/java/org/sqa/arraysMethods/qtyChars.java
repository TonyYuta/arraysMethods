package org.sqa.arraysMethods;
public class qtyChars {
	public static String str="axydd";
	public static void main(String arg[]) {
		char[] c=str.toCharArray();
		qtyChars(c);
	}
public static void qtyChars(char[] c) {
		int loop_count=0;
		int count=0;

		for(int i=0;i<c.length;i++) {

		boolean flag=true;
		for(int k=0;k<i;k++) {
			if(c[i]==(str.charAt(k)))
			flag=false;
		}
		if(flag) {
			for(int j=0;j<str.length();j++) {
			if(c[i]==str.charAt(j))
			count=count+1;
			}
			System.out.println(c[i]+ "=" +(count));
			count=0;
			loop_count++;
			}
		}
	}		
}