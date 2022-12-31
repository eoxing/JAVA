package ch2;

import java.util.*;

public class prac5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("정수 3개 입력 >> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int max = 0;
		
		if(a > b && a > c) {
			max = a;
			if(max < b + c)
				System.out.println("삼각형이 됩니다.");
			else
				System.out.println("삼각형이 되지 않습니다.");
		}
		
		else if(b > a && b > c) {
			max = b;
			if(b < a + c)
				System.out.println("삼각형이 됩니다.");
			else
				System.out.println("삼각형이 되지 않습니다.");
		}

		else if(c > a && c > b) {
			max = c;
			if(c < a + b)
				System.out.println("삼각형이 됩니다.");
			else
				System.out.println("삼각형이 되지 않습니다.");
		}
		
	}

}
