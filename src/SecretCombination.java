import java.util.Random;

public class SecretCombination extends Combination {
	
	public SecretCombination() {
		this.positions=new char[4];
		combinationGenerator();
	}
	
	private void combinationGenerator() {
		Random r=new Random();
		for (int i=0; i<NUM_COLORS; i++) {
			char color;
			do {
				color=POSIBLE_COLORS[r.nextInt(POSIBLE_COLORS.length)];
			}while (colorIsPresentIn(color)!=-1);
			this.positions[i]=color;
		}
	}
	
	public int blacks(Combination combination) {
		int result=0;
		for (int i=0; i<NUM_COLORS; i++)
			if (this.positions[i]==combination.positions[i])
				result++;
		return result;
	}
	
	public int whites(Combination combination) {
		int result=0;
		for (int i=0; i<NUM_COLORS; i++) {
			int position=colorIsPresentIn(combination.positions[i]);
			if (position!=-1 && position!=i)
				result++;
		}
		return result;
	}
	
}
