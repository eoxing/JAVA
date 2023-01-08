package ch3;

import java.util.*;

public class prac8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 몇개? ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		for(int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + " ");
		sc.close();
	}

}
