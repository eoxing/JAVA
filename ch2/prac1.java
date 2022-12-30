package ch1;

import java.util.*;

public class prac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int won;
		double dollar;
		
		System.out.print("원화를 입력하세요(단위 원) >> ");
		won = sc.nextInt();
		dollar = (double)won / 1100;
		System.out.print(won + "원은 " + "$" + dollar + "입니다.");
	}

}
