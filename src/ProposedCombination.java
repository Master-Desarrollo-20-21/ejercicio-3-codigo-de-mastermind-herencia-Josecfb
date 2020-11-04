public class ProposedCombination extends Combination{
	
	public ProposedCombination(String proposed) {
		this.positions=new char[proposed.length()];
		for (int i=0;i<proposed.length();i++)
			this.positions[i] = proposed.charAt(i);
	}
	
	public boolean isValidCombi() {
		Console console =new Console();
		if (positions.length!=4) {
			console.out("Wrong proposed combination length");
			return false;
		}
		if (isWrongColorCombi()) {
			console.out("Wrong colors, they must be: rbygop");
			return false;
		}
		if (colorIsRepeated()) {
			console.out("Repeated colors");
			return false;
		}
		return true;
	}
	
	private boolean isWrongColorCombi() {
		for (char color:positions)
			if (!isValidColor(color))
				return true;
		return false;
	}
	
	private boolean isValidColor(char color) {
		for (char posible:POSIBLE_COLORS) {
			if(color==posible) 
				return true;
		}
		return false;
	}
	
	private boolean colorIsRepeated() {
		for (int i=0;i<NUM_COLORS;i++)
			if (colorIsPresentIn(positions[i])!=-1 && colorIsPresentIn(positions[i])!=i)
				return true;
		return false;
	}

}
