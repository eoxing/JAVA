package ch2;

import java.util.*;

public class prac6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("1~99 »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À >> ");
		num = sc.nextInt();
		
		int a = num / 10;
		int b = num % 10; 
		
		if(a % 3 == 0) {
			if(b % 3 == 0)
				System.out.println("¹Ú¼ö Â¦Â¦");
			else 
				System.out.println("¹Ú¼ö Â¦");
		}
		
		if(a % 3 != 0) {
			if(b % 3 == 0)
				System.out.println("¹Ú¼ö Â¦");
		}
		
	}

}
