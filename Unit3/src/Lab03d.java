//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		//ask for user input
		System.out.print("Enter X1 ::  ");
		int x1 = keyboard.nextInt();

		System.out.print("Enter Y1 ::  ");
		int y1 = keyboard.nextInt();

		System.out.print("Enter X2 ::  ");
		int x2 = keyboard.nextInt();
		
		System.out.print("Enter Y2 ::  ");
		int y2 = keyboard.nextInt();


		Distance dist = new Distance(x1, y1, x2, y2);
		//dist.setCoordinates(x1, y1, x2, y2);
		dist.calcDistance(x1, y1, x2, y2);
		dist.print();
		
		
		
		
			
	}
}