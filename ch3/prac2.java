package ch3;

public class prac2 {

	public static void main(String[] args) {
		int n [][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
		
		//n.length = 5
		for(int i = 0; i < n.length; i++) { //5번 반복하니까 그 배열 다섯개.....
			for(int j = 0; j < n[i].length; j++)
				System.out.print(n[i][j]);
			System.out.println(" ");
		}
	}
}