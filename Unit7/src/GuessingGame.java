//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	

	public GuessingGame(int stop)
	{
		upperBound = stop;

	}

	public void playGame()
	{
		double theNum = (int)Math.random() * upperBound;
		int lol = 0;
		int wrong = 0;
		Scanner keyboard = new Scanner(System.in);
		do{
			System.out.println("Guess a number between 1 and " + upperBound);
			lol = keyboard.nextInt();
			wrong += 1;
			if (lol < 1 || lol > upperBound){
				System.out.println("Number out of range!");
			}
		}while (lol != theNum);

	}

	public String toString()
	{
		String output="";
		return output;
	}
}