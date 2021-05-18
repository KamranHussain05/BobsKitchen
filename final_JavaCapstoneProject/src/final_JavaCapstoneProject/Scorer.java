package final_JavaCapstoneProject;

public class Scorer {
	
	private static  int score; 
	
	public static void grilledCheeseScore (String bread, String cheese, String sauce, String veg1,String veg2, String veg3, String meat) {
		if (bread == "White Bread") {
			score++;
			System.out.println("1 Point for bread");
		}
		if (cheese == "american") {
			score++;
			System.out.println("1 point for cheese");
		}
		if (sauce == "none") {
			score++;
			System.out.println("1 point for no cheese");
		}
		if (veg1 == "none"&& veg2 == "none" && veg3 == "none") {
			score++;
			System.out.println("1 point for no veggies");
		}
		if (meat == "none") {
			score++;
			System.out.println("1 point for no meat");
		}
		System.out.println(score + "/5");
		
	}
	public static void banhMiScore (String bread, String cheeese, String sauce, String veg1, String veg2, String veg3, String meat) {
		if (bread == "Baguette") {
			score=score+2;
		}
		if (sauce == "Mayonaise") {
			score++;
		}
		if (veg1 == "Cucumber" && veg2 == "none" && veg3 == "none") {
			score++;
		}
		else if (veg2 == "Cucumber" && veg1 == "none" && veg3 == "none") {
			score++;
		}
		else if (veg3 == "Cucumber" && veg2 == "none" && veg1 == "none") {
			score++;
		
		}
		
		if (meat == "beef" && veg2 == "none" && veg3 == "none") {
			score++;
		}
		System.out.println(score);
	}
	public static void bltScore (String bread, String cheese, String sauce, String veg1, String veg2, String veg3, String meat) {
		if (bread == "Garlic Bread") {
			score++;
		}
		if (sauce == "Honey Mustard") {
			score++;
		}
		if (veg1 == "Lettuce" && veg2 == "tomato" && veg3 == "none") {
			score++;
		}
		else if (veg1 == "lettuce" && veg2 == "none" && veg3 == "tomato") {
			score++;
		}
		else if (veg1 == "none" && veg2 == "tomato" && veg3 == "lettuce") {
			score++;
		}
		else if (veg1 == "tomato" && veg2 == "lettuce" && veg3 == "none") {
			score++;
		}
		else if (veg1 == "none" && veg2 == "lettuce" && veg3 == "tomato") {
			score++;
		}
		else if (veg1 == "tomato" && veg2 == "none" && veg3 == "lettuce") {
			score++;
		}
		if (meat == "bacon") {
			score=score+2;
		}
		System.out.println(score);
	}
	
	public static void neopolitanScore (String crust, String sauce, String cheese, String veg1, String veg2, String meat) { 
		if (sauce == "tomato sauce" ) {
			score++; 
		} 
		if (crust == "thick crust") { 
			score++; 
		} 
		if (meat == "none") { 
			score++; 
		}
		if (cheese == "mozzarella") {
			score++;
		}
		if (veg1 == "basil" && veg2 == "none") {
			score++;
		}
		else if (veg2 == "basil" && veg2 == "none" ) {
			score++;
		}
		
		
	}
	
	public static void newYorkScore (String crust, String sauce, String cheese, String veg1, String veg2, String meat) {
		if (cheese == "Mozzarella") { 
			score++; 
		} 
		if (sauce == "Tomato") { 
			score++; 
		}
		if (crust == "Thin crust") {
			score++; 
		} 
	  }
	 
	public static int getScore() {
		int answer = score;
		return answer;
	}
	
	
}
