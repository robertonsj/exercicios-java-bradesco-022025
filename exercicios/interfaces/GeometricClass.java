package exercicios.interfaces;

import java.util.Scanner;

public class GeometricClass {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			displayMenu();
			int option = scanner.nextInt();
			
			try {
				
				AreaCalculator areaCalculator = switch(option) {
				case 1 -> getSquareSide();
				case 2 -> getRectangleDimension();
				case 3 -> getCircleRadius();
				default -> {
					throw new IllegalArgumentException("Unexpected value: " + option);
				}
				};
				
				System.out.println("Geometric Figure: " + areaCalculator.getClass().getSimpleName()
						+ "\nArea: " + areaCalculator.getArea() + "m²");
				
			}catch(Exception e ) {
				System.out.println(e.getMessage());
				continue;
			}
			
			
		}
	}
	
	private static AreaCalculator getSquareSide() {
		System.out.println("Getting square side: ");
		return new Square(scanner.nextDouble());
	}
	public static AreaCalculator getRectangleDimension() {
		System.out.println("Getting rectangle dimension: ");
		return new Rectangle(scanner.nextDouble(), scanner.nextDouble());
	}
	public static AreaCalculator getCircleRadius() {
		System.out.println("Getting circle's radius: ");
		return new Circle(scanner.nextDouble());
	}
	
	private static void displayMenu() {
		System.out.println("1 - Square\n2 - Rectangle\n3 - Circle\n");
	}

}
