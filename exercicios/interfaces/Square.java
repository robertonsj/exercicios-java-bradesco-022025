package exercicios.interfaces;

public record Square(double side) implements AreaCalculator{
	public double getArea() {
		return side * side;
	}
}
