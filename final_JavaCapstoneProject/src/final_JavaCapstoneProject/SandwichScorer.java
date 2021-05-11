package final_JavaCapstoneProject;

public class SandwichScorer {
	
	private static int score; 
	
	public static void grilledCheeseScore (String bread, String cheese) {
		if (bread == "White Bread") {
			score++;
		}
		if (cheese == "Provolone") {
			score++;
		}
		System.out.println(score);
		
	}
	
	public static String getScore() {
		String answer = String.valueOf(score);
		return answer;
	}
	
	
}
