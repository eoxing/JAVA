package ch7;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> score = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		
		System.out.print("enter the score >>");
		
		for(int i = 0; i < 6; i++) {
			String c = s.next();
			score.add(c);
		}
		
		int result = 0;
		
		for(int j = 0; j < 6; j++) {
			String c = score.get(j);
			switch(c) {
			case "A":
				result += 4;
				break;
			case "B":
				result += 3;
				break;
			case "C":
				result += 2;
				break;
			case "D":
				result += 1;
				break;
			case "F":
				result += 0;
				break;
			}
			
		}
		
		double avg = (double)result / score.size();
		System.out.println("the average of score is " + avg);
		s.close();
	}

}
