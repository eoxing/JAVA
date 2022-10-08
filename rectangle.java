package rectangle;

public class rectangle {
	int x, y, width, height;
	
	rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square () {
		return width * height;
	}
	
	void show() {
		System.out.println("("+x+","+y+")에서 크기가 " + x+"x"+y+"인 사각형의 넓이는 "+square());
	}

	public static void main(String[] args) {
		rectangle a = new rectangle(2, 2, 8, 7);
		rectangle b = new rectangle(5, 5, 6, 6);
		rectangle c = new rectangle(1, 1, 10, 10);
		
		a.show();
		b.show();
		c.show();
	}
}
