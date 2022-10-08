package song;

public class song {
	String title;
	String artist;
	String country;
	int year;
	
	song(){}
	song(String title, String artist, String country, int year){
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}

	public void show() {
		System.out.print(year+"년 "+ country+ "국적의 "+ artist+"가 부른 " + title);
	}
	
	public static void main(String[] args) {
		song mySong = new song("Dancing Queen", "ABBA","스웨덴",1978);
		mySong.show();
	}

}
