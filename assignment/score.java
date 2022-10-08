package score;

import java.util.Scanner;

public class score {
	int mathScore;
	int scienceScore;
	int englishScore;

	score (int mathScore, int scienceScore, int englishScore){
		this.mathScore = mathScore;
		this.scienceScore = scienceScore;
		this.englishScore = englishScore;
	}
	
	double average () {
		return (mathScore + scienceScore + englishScore) / 3;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력 : ");
		int mathScore = scanner.nextInt();
		int scienceScore = scanner.nextInt();
		int englishScore = scanner.nextInt();
		
		score me = new score (mathScore, scienceScore, englishScore);
		System.out.println("평균은"+me.average());
		
		scanner.close();
	}
	
}
