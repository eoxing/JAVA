package ch2;

import java.util.*;

public class prac8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1, x2, y1, y2;
		
		System.out.print("(x1, y1)�� ��ǥ�� �Է��Ͻÿ� >> ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.print("(x2, y2)�� ��ǥ�� �Է��Ͻÿ� >> ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		if((x1 >= 100 && x1 <= 200) || (x2 >= 100 && x2 <= 200) || (y1 >= 100 && y1 <= 200) || (y2 >= 100 && y2 <= 200)) {
			System.out.println("���簢���� �浹�մϴ�.");
		}
			
	}

}
