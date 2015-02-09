package stairJumpingCombinations;

public class Staircase {
	Stair firstStep;
	int numberOfSteps;

	public Staircase() {

	}

	public void create(int numberOfStairs) {
		for (int i = 0; i < numberOfStairs; i++) {
			this.add(i);
		}
		System.out.println(this.numberOfSteps);
	}

	private void add(int number) {
		Stair newStair = new Stair(number);
		Stair currentStep;
		Stair parent;
		if (this.firstStep == null) {
			this.firstStep = newStair;
			this.numberOfSteps = 1;

		} else {
			currentStep = this.firstStep;

			while (true) {
				parent = currentStep;
				currentStep = currentStep.nextStair;
				if (currentStep == null) {
					currentStep = newStair;
					currentStep.previousStair = parent;
					this.numberOfSteps++;
					return;
				}
			}
		}
	}

	public int getNumberOfCombinations() {
		this.numberOfSteps / 3
		
		if (this.numberOfSteps % )
	}

}
