package ch2;

import java.util.*;

public class openChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cheolsoo;
		String younghee;
		
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		cheolsoo = sc.next();
		System.out.print("���� >> ");
		younghee = sc.next();
		
		if(cheolsoo.equals("����")) {
			if(younghee.equals("��"))
				System.out.println("ö���� �̰���ϴ�.");
			else if(younghee.equals("����"))
				System.out.println("�����ϴ�.");
			else
				System.out.println("���� �̰���ϴ�.");
		}
		
		else if(cheolsoo.equals("����")) {
			if(younghee.equals("����"))
				System.out.println("�����ϴ�.");
			else if(younghee.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else
				System.out.println("���� �̰���ϴ�");
		}
		
		else if(cheolsoo.equals("��")) {
			if(younghee.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else if(younghee.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else
				System.out.println("�����ϴ�.");
		}
	}

}
