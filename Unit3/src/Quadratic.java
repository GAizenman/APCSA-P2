
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		
		//setEquation(0,0,0);
		//rootOne = 0;
		//rootTwo = 0;

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);
		rootOne = 0;
		rootTwo = 0;


	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
		
		

 	}

	public void calcRoots( )
	{
		
		rootOne = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
		rootTwo = (-b - Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);

	}

	public void print( )
	{
		
		System.out.println("rootone :: " + rootOne);
		System.out.println("roottwo :: " + rootTwo);

	}
}