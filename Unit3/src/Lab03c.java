//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	//add test cases
		Scanner keyboard = new Scanner(System.in);

		//ask for user input
		System.out.print("Enter side A ::  ");
		int quadA = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		int quadB = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		int quadC = keyboard.nextInt();


		Quadratic quad = new Quadratic(quadA, quadB, quadC);
		quad.setEquation(quadA, quadB, quadC);
		quad.calcRoots();
		quad.print();
	}
}