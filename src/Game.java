public class Game {
	private int attempts;
	private SecretCombination secret;
	private ProposedCombination[] combinationsAttempts;

	public Game() {
		this.attempts=0;
		this.secret=new SecretCombination();
		this.combinationsAttempts=new ProposedCombination[10];
		//secret.show();
	}
	
	public void play() {
		ProposedCombination proposed;
		do  {
			proposed=askAttent();
			this.combinationsAttempts[attempts]=proposed;
			this.attempts++;
			showAttents();
		}while (this.attempts<=10 && secret.blacks(proposed)!=4);
		if (this.attempts<10) {
			new Console().out("\nYou've won!!! ;-)");
		}else {
			new Console().out("\nYou've lost!!! :-(");
		}
	}
	
	private void showAttents() {
		new Console().out("\n"+attempts+" attempt(s):\nxxxx");
		for (int i=0;i<attempts;i++) {
			combinationsAttempts[i].show();
			new Console().out(" --> "+secret.blacks(combinationsAttempts[i])+" blacks and "+secret.whites(combinationsAttempts[i])+" whites");
		}
	}
	
	public ProposedCombination askAttent() {
		ProposedCombination proposedCombination;
		do {
			proposedCombination=new ProposedCombination(new Console().inString("\nPropose a combination: ").toUpperCase());
		}while (!proposedCombination.isValidCombi());
		return proposedCombination;
	}
}
