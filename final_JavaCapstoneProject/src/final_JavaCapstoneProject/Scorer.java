package final_JavaCapstoneProject;

public class Scorer {
	
	private static int score = 0; 
	//calculates score for Grilled Cheese out of 5 points, for white bread and cheese
	public static void grilledCheeseScore (String bread, String cheese, String sauce, String veg1,String veg2, String veg3, String meat) {
		score=0;
		// if white bread is chosen they get a point
		if (bread == "White Bread") {
			score++;
			System.out.println("1 Point for bread");
		}
		//if american cheese is the type of cheese selected they get a point
		if (cheese == "american") {
			score++;
			System.out.println("1 point for cheese");
		}
		if (sauce == "none") {
			score++;
			System.out.println("1 point for no cheese");
		}
		// if there are any vegetables they get a point
		if (veg1 == "none"&& veg2 == "none" && veg3 == "none") {
			score++;
			System.out.println("1 point for no veggies");
		}
		// if there are not meats they get a point
		if (meat == "none") {
			score++;
			System.out.println("1 point for no meat");
		}
		System.out.println(score + "/5");
		
	}
	//Banh Mi is a vietnamese style of sandwich consisting of pickled vegetables bread some sort of meat, and sauce
	// This is a beef style of banh mi
	public static void banhMiScore (String bread, String cheeese, String sauce, String veg1, String veg2, String veg3, String meat) {
		score=0;
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
		
		if (meat == "pork" && veg2 == "none" && veg3 == "none") {
			score++;
		}
		System.out.println(score);
	}
	//        
	// 
	public static void bltScore (String bread, String cheese, String sauce, String veg1, String veg2, String veg3, String meat) {
		score=0;
		if (bread == "Garlic Bread") {
			score=score+2;
		}
		if (sauce == "Honey Mustard") {
			score=score+2;
		}
		if (veg1 == "Lettuce" && veg2 == "tomato" && veg3 == "none") {
			score=score+2;
		}
		else if (veg1 == "lettuce" && veg2 == "none" && veg3 == "tomato") {
			score=score+2;
		}
		else if (veg1 == "none" && veg2 == "tomato" && veg3 == "lettuce") {
			score=score+2;
		}
		else if (veg1 == "tomato" && veg2 == "lettuce" && veg3 == "none") {
			score=score+2;
		}
		else if (veg1 == "none" && veg2 == "lettuce" && veg3 == "tomato") {
			score=score+2;
		}
		else if (veg1 == "tomato" && veg2 == "none" && veg3 == "lettuce") {
			score=score+2;
		}
		if (meat == "bacon") {
			score=score+2;
		}
		System.out.println(score);
	}
	
	public static void neopolitanScore (String crust, String sauce, String cheese, String veg1, String veg2, String meat) { 
		score=0;
		if (sauce == "tomatosauce" ) {
			score++; 
		} 
		if (crust == "thickcrust") { 
			score++; 
		} 
		if (meat == "none") { 
			score++; 
		}
		if (cheese == "mozzarella") {
			score++;
		}
		if (veg1 == "basil" && veg2 == "None") {
			score++;
		}
		else if (veg2 == "basil" && veg1 == "None" ) {
			score++;
		}
		
		
	}
	
	public static void newYorkScore (String crust, String sauce, String cheese, String veg1, String veg2, String meat) {
		score=0;
		if (cheese == "cheddar") { 
			score++; 
		} 
		if (sauce == "tomatosauce") { 
			score++; 
		}
		if (crust == "thincrust") {
			score+=3; 
		} 
	  }
	 
	public static int getScore() {
		int answer = score;
		return answer;
	}
	
	
}
