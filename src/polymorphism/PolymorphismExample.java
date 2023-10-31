package polymorphism;

class Shape {
	public void draw() {
		System.out.println("Drawing a generic shape");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	}
}

public class PolymorphismExample {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle();
		shapes[1] = new Rectangle();
		shapes[2] = new Triangle();

		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}
