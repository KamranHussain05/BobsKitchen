package final_JavaCapstoneProject;

public class SandwichScorer {
	
	private int score; 
	
	public void grilledCheese () {
		String americanCheese;
		String whiteBread;
	}
	public void bLT () {
		String bacon;
		String lettuce;
		String tomato;
		String garlicBread;
		String provolone;
	}
	public void banhMi () {
		String baguette;
		String beef;
		String cucumber;
		String carrots;
		String fishSauce;
	}
	public void grilledCheeseScore () {
		if (ScoreTester.getBreadType() == "White Bread") {
			score++;
		}
		System.out.println(score);
		
	}
	
	public int getScore() {
		
		return score;
		
	}
	
	
}
