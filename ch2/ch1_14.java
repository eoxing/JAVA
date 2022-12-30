package ch1;

import java.util.*;

public class ch1_14 {

	public static void main(String[] args) {
		String in;
		Scanner sc = new Scanner(System.in);
		
		in = sc.nextLine();
		int num = 0;
		
		switch(in) {
			case "가위" : num += 1;
			case "바위" : num += 2;
			case "보" : num += 3;
		}
		
		System.out.println(num);
	}

}
