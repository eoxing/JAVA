package ch2;

import java.util.*;

public class prac11_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.print("���� �Է��ϼ���(1~12) >> ");
		month = sc.nextInt();
		
		if(month == 3 || month  == 4 || month == 5)
			System.out.println("��");
		else if(month == 6 || month  == 7 || month == 8)
			System.out.println("����");
		else if(month == 9 || month  == 10 || month == 11)
			System.out.println("����");
		else if(month == 12 || month  == 1 || month == 2)
			System.out.println("�ܿ�");
		else
			System.out.println("�߸��Է�");
	}

}
