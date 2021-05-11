package final_JavaCapstoneProject;

public class SandwichScorer {
	
	private static int score; 
	
	public void grilledCheeseScore () {
		if (SandwichStart.getBread() == "White Bread") {
			score++;
		}
		if (SandwichCondiments.getCheese() == "Provolone") {
			score++;
		}
		System.out.println(score);
		
	}
	
	public static String getScore() {
		String answer = String.valueOf(score);
		return answer;
	}
	
	
}
