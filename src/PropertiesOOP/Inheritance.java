package PropertiesOOP;

public class Inheritance {
static class Shape {
	public void showColor() {
		System.out.println("mau trang");
			}
}
static class Rectangle extends Shape {
	public void showType() {
		System.out.println("day la hinh chu nhat");
	}
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Rectangle r1 = new Rectangle();
	r1.showColor();
	r1.showType();
}
}
