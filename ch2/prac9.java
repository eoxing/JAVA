package ch2;

import java.util.*;

public class prac9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c1, c2;
		double radius;
		int x, y;
		int dis;
		double res;
		
		System.out.print("원의 중심과 반지름 입력 >> ");
		c1 = sc.nextInt();
		c2 = sc.nextInt();
		radius = sc.nextDouble();
		
		System.out.print("점 입력 >> ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		//중심에서 점 (x, y) 사이의 거리가 반지름보다 작거나 같으면 원의 내부에 있다.
		dis = (x - c1) * (x - c1) + (y - c2) * (y - c2);
		res = Math.sqrt(dis);
		
		if(res <= radius)
			System.out.println("점 (" + x + "," + y + ")는 원 안에 있다.");
		else
			System.out.println("점 (" + x + "," + y + ")는 원 안에 있지않다.");
	}

}
