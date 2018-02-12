//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;
	

	public Name()
	{


	}

	public Name(String s)
	{
		
		name = s;

	}

   public void setName(String s)
   {
	   
	   name = s;
	   
   }

	public String getFirst()
	{

		int spa = name.indexOf(" ");
		
		return name.substring(0, spa);
		
	}

	public String getLast()
	{
		int spa = name.indexOf(" ");
		
		return name.substring(spa, name.length());

	}

 	public String toString()
 	{
 		return name;
	}
}