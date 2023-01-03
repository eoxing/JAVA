package ch2;

import java.util.*;

public class prac10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c1, c2, rad1;
		int c3, c4, rad2;
		double dis;
		double res;
		
		System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
		c1 = sc.nextInt();
		c2 = sc.nextInt();
		rad1 = sc.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력 >> ");
		c3 = sc.nextInt();
		c4 = sc.nextInt();
		rad2 = sc.nextInt();
		
		dis = (c1 - c3) * (c1 - c3) + (c2 - c4) * (c2 - c4);
		res = Math.sqrt(dis);
		
		if(res <= rad1 + rad2)
			System.out.println("두 원은 서로 겹친다");
	}

}
