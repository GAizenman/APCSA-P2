//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{

		Scanner file = new Scanner(new File("lab18e.dat"));
		String s = "";
		String h = "";

		
		int size = file.nextInt();
		Word1 hi = new Word1(s);
		file.nextLine();
		for(int i = 0; i < size; i++){
			h = file.nextLine();
			Word1 hello = new Word1(h);
			hi.compareTo(hello);
		}


		System.out.println(hi);

	}
}