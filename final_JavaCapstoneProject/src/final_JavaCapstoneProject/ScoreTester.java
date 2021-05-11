package final_JavaCapstoneProject;

import java.util.Scanner;

public class ScoreTester {
	private static String breadType;
	private static String veg1;
	private static String veg2;
	private static String veg3;
	private static String cheese;
	private static String meat;
	private static String sauce;

	public static void main(String [] args) {
		@SuppressWarnings("resource")
		Scanner kboard = new Scanner(System.in);
		
		System.out.println("Bread Type");
		breadType = kboard.next();
		
		System.out.println("Veg1");
		veg1 = kboard.next();
		
		System.out.println("Veg2");
		veg2 = kboard.next();
		
		System.out.println("Veg3");
		veg3 = kboard.next();
		
		System.out.println("Cheese");
		cheese = kboard.next();
		
		System.out.println("Meat");
		meat = kboard.next();
		
		System.out.println("Sauce");
		sauce = kboard.next();
	}
	
	public static String getBreadType() {
		return breadType;
	}

	public static String getVeg1() {
		return veg1;
	}
	
	public static  String getVeg2() {
		return veg2;
	}
	public static  String getVeg3() {
		return veg3;
	}
	public static String getCheese() {
		return cheese;
	}
	public static String getMeat() {
		return meat;
	}
	public static String getSauce() {
		return sauce;
	}
}
