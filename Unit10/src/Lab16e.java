//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Lab16e
{
	public static void main( String args[] ) throws IOException
	{
		Histogram test = new Histogram(new char[]{'a','b','c'},"lab16e1.dat");
		test.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+test.mostFrequent());
		out.println("Letter occurring least : "+test.leastFrequent());
		out.println("\n");
		out.println(test);


		Histogram lol = new Histogram(new char[]{'d','e','a'},"lab16e2.dat");
		lol.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+lol.mostFrequent());
		out.println("Letter occurring least : "+lol.leastFrequent());
		out.println("\n");
		out.println(lol);
		
		Histogram haha = new Histogram(new char[]{'x','a','r', 'g'},"lab16e3.dat");
		haha.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+haha.mostFrequent());
		out.println("Letter occurring least : "+haha.leastFrequent());
		out.println("\n");
		out.println(haha);
		//more test cases
	}
}