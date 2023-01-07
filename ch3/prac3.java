package ch3;

import java.util.*;

public class prac3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수를 입력하시오 >> ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			for(int j = i-1; j < n; j++) 
				System.out.print("*");
			System.out.println(" ");
		}
		
		sc.close();
	}

}
