package ch2;

import java.util.*;

public class prac5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("���� 3�� �Է� >> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int max = 0;
		
		if(a > b && a > c) {
			max = a;
			if(max < b + c)
				System.out.println("�ﰢ���� �˴ϴ�.");
			else
				System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");
		}
		
		else if(b > a && b > c) {
			max = b;
			if(b < a + c)
				System.out.println("�ﰢ���� �˴ϴ�.");
			else
				System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");
		}

		else if(c > a && c > b) {
			max = c;
			if(c < a + b)
				System.out.println("�ﰢ���� �˴ϴ�.");
			else
				System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");
		}
		
	}

}
