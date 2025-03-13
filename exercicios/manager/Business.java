package exercicios.manager;

import java.util.HashMap;

public class Business {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager("roberto", "roberto@gmail", "12tres");
		System.out.println(manager);
		
		manager.sales.put(1, "sale one");
		manager.sales.put(2, "sale two");
		manager.sales.put(3, "sale three");
		
		manager.searchSales();
	}

}
