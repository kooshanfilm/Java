public class Game {
  private String mAnswer;
  private String mHits;
  private String mMisses;

 
  // constractor 
  public Game(String answer){
  	mAnswer = answer;
  	mMisses = "";
  	public static final int MAX_MISSES = 7 ; 

   }

   public boolean applyGuess(String letters){
     if (letters.length() == 0){
      throw new IllegalArgumentException("No letter found");

     }
     char firstLetter = letters.charAt(0);
     return applyGuess(firstLetter);
   }

   private char validateGuess(char letter){
      if (! Character.isLetter(letter)){
        throw new IllegalArgumentException("A letter is required");
      }
      letter = character.toLowerCase(letter);
      if(mMisses.indexOf(letter) >= 0 || mHits.indexOf(letter) >= 0){
        throw new IllegalArgumentException(letter + "has already been guessed");
      }
      return
   }

   public boolean applyGuess(char letter){
    boolean isHit = mAnswer.indexOf(letter) >= 0;
    if(isHit){
    	mHits += letter;
    }else{
    	mMisses += letter;
    }
    return isHit;
   }
   public String getCurrentProgress(){
   	 String progress = "";
   	 for (char letter: mAnswer.toCharArray()){
   	 	char display = "-";
   	 	if (mHits.indexOf(letter) >= 0){
   	 		display = letter;
   	 	}
   	 	progress += display;
   	 }
   	 return progress;
   }

   public int getRemaingTries(){
   	return MAX_MISSES - mMisses.length();
   	 }

   public void displayProgress(){
   	 System.out.printf("Try to solve: %s\n",mGame.getCurrentProgress());
   }

}

