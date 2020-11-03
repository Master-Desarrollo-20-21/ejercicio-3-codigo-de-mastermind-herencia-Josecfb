public class Mastermind {
	
//	public static void main(String[] args) {	
//		char resume;
//		do {
//			new Game().play();
//			resume=new Console().inString("\nResume (Y/N)").toUpperCase().charAt(0);	
//		}while (resume!='N');
//	}
	
	private Game game; 

	  public Mastermind(){ 
	    this.game = new Game(); 
	  } 

	  private void play() { 
	    do { 
	      this.game.play(); 
	    } while(this.isResumed()); 
	  } 

	  private boolean isResumed() { 
	    String answer; 
	    Console console = new Console(); 
	    do { 
	      answer = console.inString("\n¿Quieres continuar? (s/n): "); 
	    } while (!answer.equals("s") && !answer.equals("n")); 
	    return answer.equals("s"); 
	  } 

	  public static void main(String[] args) { 
	    new Mastermind().play(); 
	  } 
}
