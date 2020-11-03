public class Combination {
	protected char[] positions;
	protected final int NUM_COLORS=4;
	protected final char[] POSIBLE_COLORS={'R','B','Y','G','O','P'};
	
	protected int colorIsPresentIn(char color) {
		for (int i=0; i<NUM_COLORS; i++){
			if (color==this.positions[i])
				return i;
		}
		return -1;
	}

	protected void show() {
		String salida="\n"; 
		for (char color:positions){
			salida+=color;
		}
		new Console().out(salida);
	}
	
}
