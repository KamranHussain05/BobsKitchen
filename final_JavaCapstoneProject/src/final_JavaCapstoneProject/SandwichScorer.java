package final_JavaCapstoneProject;

public class SandwichScorer {
	
	private static int score; 
	
	public static void grilledCheeseScore (String bread, String cheese) {
		if (bread == "White Bread") {
			score++;
		}
		if (cheese == "American") {
			score++;
		}
		System.out.println(score);
		
	}
	public static void banhMiScore (String bread, String sauce, String veggies, String meat) {
		if (bread == "Baguette") {
			score++;
		}
		if (sauce == "Mayonaise") {
			score++;
		}
		if (veggies == "Cucumber") {
			score++;
		}
		if (meat == "beef") {
			score++;
		}
		System.out.println(score);
	}
	public static void bLT (String bread, String sauce, String veg1, String veg2, String meat) {
		if (bread == "Garlic Bread") {
			score++;
		}
		if (sauce == "Honey Mustard") {
			score++;
		}
		if (veg1 == "Lettuce") {
			score++;
		}
		if (veg2 == "tomato") {
			score++;
		}
		if (meat == "bacon") {
			score++;
		}
		System.out.println(score);
	}
	
	/*
	 * public static void pizzaScorer (String cheese, String sauce, String dough) {
	 * if (cheese == "Mozzarella") { score++; } if (sauce == "Tomato") { score++; }
	 * if (dough == "Thin crust") { score++; } }
	 */
	public static String getScore() {
		String answer = String.valueOf(score);
		return answer;
	}
	
	
}
