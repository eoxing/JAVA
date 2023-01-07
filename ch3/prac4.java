package ch3;

import java.util.*;

public class prac4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
		char s = sc.next().charAt(0);
		
		for (int i = 97; i <= s; i++ ) {
			for(int j = s; s > 0; s--)
				System.out.print((char)i);
			System.out.println(" ");
		}
		
		sc.close();
	}
}
