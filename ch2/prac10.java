package ch2;

import java.util.*;

public class prac10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c1, c2, rad1;
		int c3, c4, rad2;
		double dis;
		double res;
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է� >> ");
		c1 = sc.nextInt();
		c2 = sc.nextInt();
		rad1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է� >> ");
		c3 = sc.nextInt();
		c4 = sc.nextInt();
		rad2 = sc.nextInt();
		
		dis = (c1 - c3) * (c1 - c3) + (c2 - c4) * (c2 - c4);
		res = Math.sqrt(dis);
		
		if(res <= rad1 + rad2)
			System.out.println("�� ���� ���� ��ģ��");
	}

}
