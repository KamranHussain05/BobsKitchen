package final_JavaCapstoneProject;

//Name: William Le
//Date:5/22/2021
//Revision:08

public class Scorer {
	
	private static int score = 0;
	private static String methodCalled;
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
		//if no sauce is selected they get a point
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
		methodCalled = "sandwich";
	}
	//Banh Mi is a vietnamese style of sandwich consisting of pickled vegetables bread some sort of meat, and sauce
	// This is a beef style of banh mi
	public static void banhMiScore (String bread, String cheeese, String sauce, String veg1, String veg2, String veg3, String meat) {
		score=0;
		if (bread == "Baguette") { 
			score=score+2;
			System.out.println("baguette selected plus two points");
		}
		if (veg1 == "cucumber") {
			score++;
			System.out.println("cucumber selected plus one point");
		}
		else if (veg2 == "cucumber") {
			score++;
			System.out.println("cucumber selected plus one point");
		}
		else if (veg3 == "cucumber") {
			score++;
			System.out.println("cucumber selected plus one point");
		}
		if (meat == "pork") {
			score=score+2;
			System.out.println("pork selected plus two point");
		}
		System.out.println(score);
		methodCalled = "sandwich";
	}
	//        
	// blt stands for Bacon Lettuce Tomato and these are the main components of the sandwich with some slight variants
	public static void bltScore (String bread, String cheese, String sauce, String veg1, String veg2, String veg3, String meat) {
		score=0;
		if (bread == "White Bread") {
			score++;
			System.out.println("white bread selected plus one point");
		}
		if (veg1 == "lettuce" && veg2 == "tomato" && veg3 == "none") {
			score=score+2;
			System.out.println("veggies selected plus two point");
		}
		else if (veg1 == "lettuce" && veg2 == "none" && veg3 == "tomato") {
			score=score+2;
			System.out.println("veggies selected plus two point");
		}
		else if (veg1 == "none" && veg2 == "tomato" && veg3 == "lettuce") {
			score=score+2;
			System.out.println("veggies selected plus two point");
		}
		else if (veg1 == "tomato" && veg2 == "lettuce" && veg3 == "none") {
			score=score+2;
			System.out.println("veggies selected plus two point");
		}
		else if (veg1 == "none" && veg2 == "lettuce" && veg3 == "tomato") {
			score=score+2;
			System.out.println("veggies selected plus two point");
		}
		else if (veg1 == "tomato" && veg2 == "none" && veg3 == "lettuce") {
			score=score+2;
			System.out.println("veggies selected plus two point");
		}
		if (meat == "bacon") {
			score++;
			System.out.println("meat selected plus one point");
		}
		if (cheese == "american") {
			score++;
			System.out.println("american cheese selected plus one point");
		}
		System.out.println(score);
		methodCalled = "sandwich";
	}
	//
	//Neapolitan Score is composed of tomato sauce, thick crust, no meats, and basil
	public static void neopolitanScore (String crust, String sauce, String cheese, String veg1, String veg2, String meat) { 
		score=0;
		if (sauce == "tomatosauce" ) {
			score++; 
			System.out.println("tomato sauce plus one point");
		} 
		if (crust == "thincrust") { 
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
		else if (veg2 == "basil" && veg1 == "none" ) {
			score++;
		}
		System.out.println(score);
		methodCalled = "pizza";
	}
	// New York style pizza composing of cheddar, tomatosauce, thincrust
	public static void newYorkScore (String crust, String sauce, String cheese, String veg1, String veg2, String meat) {
		score=0;
		if (cheese == "cheddar") { 
			score++; 
			System.out.println("cheddar selected plus one point");
		} 
		if (sauce == "tomatosauce") { 
			score++; 
			System.out.println("tomato sauce selected plus one point");
		}
		if (crust == "thincrust") {
			score=score+3; 
			System.out.println("thin crust selected plus 3 points");
		} 
		System.out.println(score);
		methodCalled = "pizza";
	  }
	//Pho is made of broth, noodles, usually a meat but not required, and toppings
	//Beef pho is pho made using beef bones stock, vermiceeli noodles, fattybrisket and tendon as the meat, and various toppings
	 public static void beefPho(String broth1, String noodle, String beef1, String beef2, String chicken1, String chicken2, String toppings1, String toppings2, String toppings3, String toppings4, String toppings5, String toppings6, String toppings7, String toppings8, String toppings9) {
		 score = 0;
		 if (broth1 == "beef stock") {
			 score=score+2;
			 System.out.println("beef broth plus one point");
		 }
		 if (noodle == "vermicelli") {
			 score++;
			 System.out.println("vermicelli plus one point");
		 }
		 if (beef1 == "fattybrisket" && beef2 == "tendon" && chicken1 == "none" && chicken2 == "none") {
			 score++;
			 System.out.println("beef meat plus one point");
		 }
		 if (beef1 == "tendon" && beef2 == "fattybrisket" && chicken1 == "none" && chicken2 == "none") {
			 score++;
			 System.out.println("beef meat plus one point");
		 }
		 // if they have a topping they get a point
		 if (toppings1.isEmpty() || toppings2.isEmpty() || toppings3.isEmpty() || toppings4.isEmpty() || toppings5.isEmpty() || toppings6.isEmpty() || toppings7.isEmpty() || toppings8.isEmpty() || toppings9.isEmpty()) {
			
		 } else {
			 score++;
			 System.out.println("Toppings plus one point");
		 }
		 
		 System.out.println(score);
		 methodCalled = "pho";
	 }
	 // chicken pho is made of chicken stock, glass noodles, chicken breast and skin, and various toppings
	public static void chickenPho(String broth1, String noodle, String beef1, String beef2, String chicken1, String chicken2, String toppings1, String toppings2, String toppings3, String toppings4, String toppings5, String toppings6, String toppings7, String toppings8, String toppings9) {
		score = 0; 
		if (broth1 == "chicken stock") {
			 score=score+2;
			 System.out.println("chicken stock plus one point");
		 }
		 if (noodle == "glass noodles") {
			 score++;
			 System.out.println("glass noodles plus one point");
		 }
		 if (beef1 == "none" && beef2 == "none" && chicken1 == "chickenbreast" && chicken2 == "chickenskin") {
			 score++;
			 System.out.println("chicken meat plus one point");
		 }
		 if (beef1 == "none" && beef2 == "none" && chicken1 == "chickenskin" && chicken2 == "chickenbreast") {
			 score++;
			 System.out.println("chicken meat plus one point");
		 }
		 // if they have a topping they get a point
		 if (toppings1.isEmpty() || toppings2.isEmpty() || toppings3.isEmpty() || toppings4.isEmpty() || toppings5.isEmpty() || toppings6.isEmpty() || toppings7.isEmpty() || toppings8.isEmpty() || toppings9.isEmpty()) {
				
		 } else {
			 score++;
			 System.out.println("chicken stock plus one point");
		 }
		 System.out.println(score);
		 methodCalled = "pho";
	}
	//vegetable pho is made of veggie stock using mushrooms as a source of "meatiness", vermicelli noodles, no meat, and plenty of toppings
	public static void veggiePho(String broth1, String noodle, String beef1, String beef2, String chicken1, String chicken2, String toppings1, String toppings2, String toppings3, String toppings4, String toppings5, String toppings6, String toppings7, String toppings8, String toppings9) {
		score = 0; 
		if (broth1 == "veggie stock") {
			 score=score+2;
			 System.out.println("veggie stock plus one point");
		 }
		 if (noodle == "vermicelli") {
			 score++;
			 System.out.println("vermicelli plus one point");
		 }
		 if (beef1 == "none" && beef2 == "none" && chicken1 == "none" && chicken2 == "none") {
			 score++;
			 System.out.println("no meat plus one point");
		 }
		 if (beef1 == "none" && beef2 == "none" && chicken1 == "none" && chicken2 == "none") {
			 score++;
			 System.out.println("no meat plus one point");
		 }
		 // if they have a topping they get a point
		 if (toppings1.isEmpty() || toppings2.isEmpty() || toppings3.isEmpty() || toppings4.isEmpty() || toppings5.isEmpty() || toppings6.isEmpty() || toppings7.isEmpty() || toppings8.isEmpty() || toppings9.isEmpty()) {
				
		 } else {
			 score++;
			 System.out.println("toppings plus one point");
		 }
		 System.out.println(score);
		 methodCalled = "pho";
	}
	
	public static int getScore() {
		int answer = score;
		return answer;
	}
	
	public static String getLevel() {
		return methodCalled;
	}
}
