package ch2;

import java.util.*;

public class prac12_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		String cal;
		
		System.out.print("���� >> ");
		
		a = sc.nextDouble();
		cal = sc.next();
		b = sc.nextDouble();
		
		switch(cal) {
		case "+":
			System.out.println(a + "+" + b + "�� �������� " + (a+b));
			break;
		case "-":
			System.out.println(a + "-" + b + "�� �������� " + (a-b));
			break;
		case "*":
			System.out.println(a + "*" + b + "�� �������� " + (a*b));
			break;
		case "/":
			if(b == 0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else
				System.out.println(a + "/" + b + "�� �������� " + (a/b));
			break;
		}
	}

}
