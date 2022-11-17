package ch7;

//Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 벡터에 저장하고
//벡터를 검색하여 가장 큰수를 출력하는 프로그램 작성 

import java.util.*;

public class VectorB {

	public static void main(String[] args) {
		Vector<Integer> V = new Vector<Integer>();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("enter the int. if you enter -1, this program will be done >> ");
			int i = s.nextInt();
			V.add(i);
			
			if(i == -1) {
				int big = V.get(0);
				for(int j = 0; j < V.size(); j++) {
					if(big < V.get(j)) {
						big = V.get(j);
					}
				}
				System.out.println("the biggest is " + big);
				break;
			}
		}
	}

}
