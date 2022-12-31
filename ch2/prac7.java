package ch2;

import java.util.*;

public class prac7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.print("점 (x,y)의 좌표를 입력하시오 >> ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if((x > 100 && x < 200) && (y > 100 && y < 200))
			System.out.println("(" + x + "," + y + ")은 사각형 안에 있습니다.");
	}

}
