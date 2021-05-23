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
	//
	//
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
	//
	//
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
	 public static void beefPho(String broth1, String broth2, String broth3, String broth4, String noodle, String beef1, String beef2, String chicken1, String chicken2, String toppings1, String toppings2, String toppings3, String toppings4, String toppings5, String toppings6, String toppings7, String toppings8, String toppings9) {
		 if (broth1 == "beef bones" && broth2 == "aromatics" && broth3 == "fish sauce" && broth4 == "grilled onions") {
			 score=score+2;
		 }
		 if (noodle == "vermicelli") {
			 score++;
		 }
		 if (beef1 == "fatty brisket" && beef2 == "tendon" && chicken1 == "none" && chicken2 == "none") {
			 score++;
		 }
		 if (beef1 == "tendon" && beef2 == "fatty brisket" && chicken1 == "none" && chicken2 == "none") {
			 score++;
		 }
		 if (toppings1 == "green onions" || toppings2 == "basil" || toppings3 == "scallions" || toppings4 == "cilantro" || toppings5 == "fried onions" || toppings6 == "bean sprouts" || toppings7 == "hot chili oil" || toppings8 == "siracha" || toppings8 == "hoison sauce") {
			 score++;
		 }
	 }
public static void chickenPho(String broth1, String broth2, String broth3, String broth4, String noodle, String beef1, String beef2, String chicken1, String chicken2, String toppings1, String toppings2, String toppings3, String toppings4, String toppings5, String toppings6, String toppings7, String toppings8, String toppings9) {
	 if (broth1 == "chicken stock" && broth2 == "aromatics" && broth3 == "fish sauce" && broth4 == "grilled onions") {
		 score=score+2;
	 }
	 if (noodle == "glass noodles") {
		 score++;
	 }
	 if (beef1 == "none" && beef2 == "none" && chicken1 == "chicken breast" && chicken2 == "chicken skin") {
		 score++;
	 }
	 if (beef1 == "none" && beef2 == "none" && chicken1 == "chicken skin" && chicken2 == "chicken breast") {
		 score++;
	 }
	 if (toppings1 == "green onions" || toppings2 == "basil" || toppings3 == "scallions" || toppings4 == "cilantro" || toppings5 == "fried onions" || toppings6 == "bean sprouts" || toppings7 == "hot chili oil" || toppings8 == "siracha" || toppings8 == "hoison sauce") {
		 score++;
	 }
}
public static void veggiePho(String broth1, String broth2, String broth3, String broth4, String noodle, String beef1, String beef2, String chicken1, String chicken2, String toppings1, String toppings2, String toppings3, String toppings4, String toppings5, String toppings6, String toppings7, String toppings8, String toppings9) {
	 if (broth1 == "veggie stock" && broth2 == "aromatics" && broth3 == "fish sauce" && broth4 == "grilled onions") {
		 score=score+2;
	 }
	 if (noodle == "vermicelli") {
		 score++;
	 }
	 if (beef1 == "none" && beef2 == "none" && chicken1 == "none" && chicken2 == "none") {
		 score++;
	 }
	 if (beef1 == "none" && beef2 == "none" && chicken1 == "none" && chicken2 == "none") {
		 score++;
	 }
	 if (toppings1 == "green onions" || toppings2 == "basil" || toppings3 == "scallions" || toppings4 == "cilantro" || toppings5 == "fried onions" || toppings6 == "bean sprouts" || toppings7 == "hot chili oil" || toppings8 == "siracha" || toppings8 == "hoison sauce") {
		 score=score+2;
	 }
}
	public static int getScore() {
		int answer = score;
		return answer;
	}
	
	
}
