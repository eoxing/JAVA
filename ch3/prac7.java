package ch3;


public class prac7 {

	public static void main(String[] args) {	
		int arr[] = new int[10];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		System.out.print("랜덤한 정수들 : ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}

		System.out.println(" ");
		System.out.print("평균은 " + sum/10);	
	}
	
}
