package ch2;

import java.util.*;

public class prac12_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		String cal;
		
		System.out.print("연산 >> ");
		
		a = sc.nextDouble();
		cal = sc.next();
		b = sc.nextDouble();
		
		switch(cal) {
		case "+":
			System.out.println(a + "+" + b + "의 연산결과는 " + (a+b));
			break;
		case "-":
			System.out.println(a + "-" + b + "의 연산결과는 " + (a-b));
			break;
		case "*":
			System.out.println(a + "*" + b + "의 연산결과는 " + (a*b));
			break;
		case "/":
			if(b == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.println(a + "/" + b + "의 연산결과는 " + (a/b));
			break;
		}
	}

}
