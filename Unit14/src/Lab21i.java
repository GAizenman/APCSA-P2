//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		
		
		Scanner file = new Scanner(new File("lab21i.dat"));
		int num = file.nextInt();
		file.nextLine();
		String hi = "";
		hi = file.nextLine();
		Maze lol = new Maze(num, hi);
		System.out.println(lol.toString());
		/*while (file.hasNextLine()){
			hi = file.nextLine();
			Maze lol = new Maze(num, hi);
			System.out.println(lol.toString());
			num = file.nextInt();
			file.nextLine();
		}*/
		num = file.nextInt();
		file.nextLine();
		hi = file.nextLine();
		Maze coo = new Maze(num, hi);
		System.out.println(coo.toString());
	}
}