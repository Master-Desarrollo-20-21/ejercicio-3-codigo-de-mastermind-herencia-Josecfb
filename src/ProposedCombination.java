public class ProposedCombination extends Combination{
	
	public ProposedCombination(String proposed) {
		this.positions=new char[proposed.length()];
		for (int i=0;i<proposed.length();i++)
			this.positions[i] = proposed.charAt(i);
	}
	
	public boolean isValidCombi() {
		if (positions.length!=4) {
			System.out.println("Wrong proposed combination length");
			return false;
		}
		if (isWrongColorCombi()) {
			System.out.println("Wrong colors, they must be: rbygop");
			return false;
		}
		if (colorIsRepeated()) {
			System.out.println("Repeated colors");
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
