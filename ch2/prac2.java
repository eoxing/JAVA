package ch1;

import java.util.*;

public class prac2 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99) >> ");
		num = sc.nextInt();
		
		if(num % 11 == 0)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("No! 10의 자리가 1의 자리가 같지 않습니다.");
	}

}
