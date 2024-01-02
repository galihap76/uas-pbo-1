import java.util.Scanner;

class Shape{
	private final String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getArea() {
		return 0;
	}
}

class Circle extends Shape{
	private final double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape{
	private final double length;
	private final double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return length * width;
	}
}

class ShapeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Perhitungan Luas Lingkaran");
		System.out.println("================================");
		
		System.out.println("Masukkan warna lingkaran : ");
		String colorCircle = scanner.nextLine();
		
		System.out.println("Masukkan radius lingkaran : ");
		double radius = scanner.nextDouble();
		
		Circle circle = new Circle(colorCircle, radius);
		System.out.println("Luas lingkaran : " + circle.getArea());
		
		System.out.print("\n");
		
		System.out.println("Perhitungan Luas Persegi Panjang");
		System.out.println("=================================");
		System.out.println("Masukkan warna persegi panjang : ");
		scanner.nextLine();
		
		String colorRectangle = scanner.nextLine();
		System.out.println("Masukkan panjang persegi panjang : ");
		
		double length = scanner.nextDouble();
		
		System.out.println("Masukkan lebar persegi panjang : ");
		double width = scanner.nextDouble();
		
		Rectangle rectangle = new Rectangle(colorRectangle, length, width);
		System.out.println("Luas persegi panjang : " + rectangle.getArea());
		
		scanner.close();
	}

}
