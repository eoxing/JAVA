public class TV {
    int year;
    int size;
    String brand;

    public TV(String brand, int year, int size) {
        this.brand = brand;
        this.year = year;
        this.size = size;
    }

    public void show() {
        System.out.println(brand + "에서 만든" + year + "년" + size + "인치");
    }

    public static void main(String[] args) {
        TV myTV = newTV("LG", 2017, 32);// LG에서 만든 2017년 32인치
        myTV.show();
    }
}