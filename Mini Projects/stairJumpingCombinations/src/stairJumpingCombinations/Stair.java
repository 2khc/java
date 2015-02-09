package stairJumpingCombinations;

public class Stair {
	Stair nextStair;
	Stair previousStair;
	Stair floor;
	int number;

	public Stair(int stairNumber) {
		this.number = stairNumber;
	}

}
