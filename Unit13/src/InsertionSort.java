//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{

		list = new ArrayList<String>();

	}

	//modfiers
	public void add( String  word)
	{
		int loc = 0;
		String alp = "abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 0; i < list.size(); i++) {
			if(alp.indexOf(word.charAt(0)) > alp.indexOf(list.get(i).charAt(0))) {
				loc++;
			}
		}
		
		list.add(loc, word);

	}


	public void remove(String word)
	{
		
		list.remove(word);

	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < list.size(); i++) {
			output = output + " " + list.get(i);
		}
		return output;
	}
}