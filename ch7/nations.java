package ch7;

import java.util.*;

public class nations {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 입력하세요 (예: Korea 5000)");
		
		while(true) {
			System.out.print("나라이름, 인구 >> " );
			
			String nation = sc.next();
			if(nation.equals("그만"))
				break;
			int people = sc.nextInt();
			nations.put(nation, people);
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String n = sc.next();
			if(n.equals("그만"))
				break;
			if(n == null)
				System.out.println("그런 나라는 없습니다");
			else
				System.out.println(n + "의 인구는 " + nations.get(n));
		}
		
	}

}
