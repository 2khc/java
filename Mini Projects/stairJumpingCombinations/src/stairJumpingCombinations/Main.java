package stairJumpingCombinations;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Staircase staircase = new Staircase();
		int numberOfSteps = 4;
		int currentStep = 0;
		int numberOfCombinations;
int counter;

		List<Integer> listOfCombinations = new ArrayList<Integer>();

		staircase.create(100);

		for (int i = 1; i < listOfCombinations.size(); i++) {
			counter = 0;
			int value = 0;
			while (counter < i){
				if (counter == 1){
					listOfCombinations.set(counter, 1);
				}
				if (counter == 2){
					listOfCombinations.set(counter, 2);
				}
				if(counter==3){
					listOfCombinations.set(counter,4);
				}
				value += listOfCombinations.get(counter);
				counter++;
			}
			value = listOfCombinations.get(i-1);
			
			
			listOfCombinations.set(i, value);
		}
	}
}
