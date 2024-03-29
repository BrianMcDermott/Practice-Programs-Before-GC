public class Methods {
	
	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		
		
		
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);
		
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		
		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Jack", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Tom", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Jeremiah", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Joseph", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Timmy", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Chris", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("Frank", highScorePosition);
		
	}
	public static void displayHighScorePosition(String playerName, int highScorePosition){
		System.out.println(playerName + " managed to get into position "
				+ highScorePosition + " on the High Score table.");
	}
	
	public static int calculateHighScorePosition(int playerScore){
		if(playerScore>=1000){
			return 1;
		} else if(playerScore>=500 && playerScore<1000) {
			return 2;
		} else if(playerScore>=100 && playerScore<500) {
			return 3;
		} else {
			return 4;
		}
	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			return finalScore;
			
		}
		
		return -1;
	}
}