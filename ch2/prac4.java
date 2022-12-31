package ch2;

import java.util.*;

public class prac4 {

	public static void main(String[] args) {
		int num1, num2, num3;
		int mid = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력 >> ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		
		if(num1 > num2 && num2 > num3)
			mid = num2;
		else if(num1 < num2 && num1 > num3)
			mid = num1;
		else if(num3 < num2 && num3 > num1)
			mid = num3;
		
		System.out.println("중간 값은 " + mid);
	}

}
