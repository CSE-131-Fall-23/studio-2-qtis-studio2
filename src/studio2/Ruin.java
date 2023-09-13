package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your start amount:");
		double startAmount = in.nextDouble();
		double startAmount2 = startAmount;
		System.out.println("Enter the win probability:");
		double winChance = in.nextDouble();
		System.out.println("Enter your win limit");
		double winLimit = in.nextDouble();
		System.out.println("How many simulations?");
		int totalSimulations = in.nextInt();
		int dayNumber = 1; 
		while(totalSimulations > 0)
		{
			int winCounter = 0;
			int lossCounter = 0;
			System.out.println("Simulation: " + dayNumber);		
			while (0 < startAmount && startAmount < winLimit) {
				double x= (Math.random());
				if(winChance >= x)
				{
 					//System.out.println("Win");
					startAmount++;
					winCounter++;
				}
				else 
				{
					//System.out.println("Loss");
					startAmount--;
					lossCounter++;
				}
				if(startAmount == 0) {
					System.out.println("Losses: " + lossCounter);
					System.out.println("Ruin! Your day is over");
					dayNumber ++;
				}
				else if(startAmount == winLimit) {
					System.out.println("Wins: " + winCounter);
					System.out.println("Success");
					dayNumber ++;
				}

				//System.out.println(startAmount);
			}
			startAmount = startAmount2;
			totalSimulations--;

		}

	}

}
