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
		
		System.out.print("���� �߽ɰ� ������ �Է� >> ");
		c1 = sc.nextInt();
		c2 = sc.nextInt();
		radius = sc.nextDouble();
		
		System.out.print("�� �Է� >> ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		//�߽ɿ��� �� (x, y) ������ �Ÿ��� ���������� �۰ų� ������ ���� ���ο� �ִ�.
		dis = (x - c1) * (x - c1) + (y - c2) * (y - c2);
		res = Math.sqrt(dis);
		
		if(res <= radius)
			System.out.println("�� (" + x + "," + y + ")�� �� �ȿ� �ִ�.");
		else
			System.out.println("�� (" + x + "," + y + ")�� �� �ȿ� �����ʴ�.");
	}

}
