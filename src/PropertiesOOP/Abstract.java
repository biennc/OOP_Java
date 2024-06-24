package PropertiesOOP;

public class Abstract {
	abstract class Shape {
		protected int x;
		protected int y;
		public Shape(int x, int y) {
			this.x =x;
			this.y = y;
		}
		public abstract void draw();

	}
	abstract class Circle extends Shape {
		private int radius;
		public Circle(int x, int y, int radius) {
			super (x,y);
			this.setRadius(radius);
		}
		public int getRadius() {
			return radius;
		}
		public void setRadius(int radius) {
			this.radius = radius;
		}
		@Override 
		public void draw() {
			System.out.println("Drawing a circle at ("+x+", "+y+") with radius" +radius);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	}
	}
