package ch2;

import java.util.*;

public class prac7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ� >> ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if((x > 100 && x < 200) && (y > 100 && y < 200))
			System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �ֽ��ϴ�.");
	}

}
