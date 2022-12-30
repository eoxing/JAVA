package ch1;

import java.util.*;

public class prac3 {

	public static void main(String[] args) {
		int money;
		int rest;
		int fiftyThousand;
		int tenThousand;
		int thousand;
		int hundred;
		int fifty;
		int ten;
		int one;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하십시오 >> ");
		money = sc.nextInt();
		
		fiftyThousand = money / 50000;
		rest = money % 50000;
		tenThousand = rest / 10000;
		rest %= 10000;
		thousand = rest / 1000;
		rest %= 1000;
		hundred = rest / 100;
		rest %= 100;
		fifty = rest / 50;
		rest %= 50;
		ten = rest / 10;
		rest %= 10;
		one = rest / 1;
		rest %= 1;
		
		System.out.println("오만원권 " + fiftyThousand + "매");
		System.out.println("만원권 " + tenThousand + "매");
		System.out.println("천원권 " + thousand + "매");
		System.out.println("백원 " + hundred + "개");
		System.out.println("오십원 " + fifty + "개");
		System.out.println("십원 " + ten + "개");
		System.out.println("일원 " + one + "개");
		
	}

}
