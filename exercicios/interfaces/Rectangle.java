package exercicios.interfaces;

public record Rectangle(double height, double width) implements AreaCalculator {
	public double getArea() {
		return height * width;
	}
}
