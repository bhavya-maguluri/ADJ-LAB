
package Network;

import java.util.Scanner;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		int v=0,c=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
					v++;
				}
				else {
					c++;
				}
			}
		}
		System.out.println("Vowels : "+v);
		System.out.println("Consonants : "+c);
		String st ="Vowels : "+v+"\nConsonants : "+c;
		System.out.println(st);
	}

}