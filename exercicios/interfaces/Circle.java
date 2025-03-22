package exercicios.interfaces;

public record Circle(double radius) implements AreaCalculator {
	private static final double PI = 3.14;
	
	public double getArea() {
		return PI * (radius * radius);
	}
}
