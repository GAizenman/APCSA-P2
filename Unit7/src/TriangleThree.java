//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( int count, String let )
	{
		letter = let;
		size = count;
	}

	public String getLetter()
	{
		for (int i = 0; i <= size; i++){
			String cool = "";
			while (cool.length() < i){
				cool = cool + letter;
			}
			while (cool.length() < size){
				cool = " " + cool;
			}
			System.out.println(cool);
		}
		return "#";
	}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}