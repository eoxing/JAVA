package ch7;

import java.util.*;

public class PointManagementEX {

	public static void main(String[] args) {
		HashMap<String, Integer> P = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("** 포인트 관리 프로그램입니다. **");
		
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			
			String name = sc.next();
			int point = sc.nextInt();
			
			if(name.equals("그만"))
				break;
			
			if(P.get(name) == null)
				P.put(name, point);
			
			else
				P.put(name, point + P.get(name));
			
			Set<String> keys = P.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {
				String Name = it.next();
				int Point = P.get(Name);
				System.out.print("("+Name+","+Point+")");
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
