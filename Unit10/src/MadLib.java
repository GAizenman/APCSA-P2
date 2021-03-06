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

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{

		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();


	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
			
			
			while(file.hasNext()){
				String test = file.next();
				if(test.equals("#")){
					out.print(getRandomNoun() + " ");
				}
				
				else if(test.equals("@")){
					out.print(getRandomVerb() + " ");
				}
				
				else if(test.equals("&")){
					out.print(getRandomAdjective() + " ");
				}
				else{
					out.print(test + " ");
				}
			}
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston, we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
		
			Scanner scan = new Scanner(new File("C:\\Users\\aizenmang2856\\Desktop\\Github\\APCSA-P2\\Unit10\\src\\nouns.dat"));
			while (scan.hasNextLine()){
				nouns.add(scan.nextLine());
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
	
			Scanner scan = new Scanner(new File("C:\\Users\\aizenmang2856\\Desktop\\Github\\APCSA-P2\\Unit10\\src\\verbs.dat"));
			while (scan.hasNextLine()){
				verbs.add(scan.nextLine());
			}
	
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
		}
	}

	public void loadAdjectives()
	{
		try{
	
			Scanner scan = new Scanner(new File("C:\\Users\\aizenmang2856\\Desktop\\Github\\APCSA-P2\\Unit10\\src\\adjectives.dat"));
			while (scan.hasNextLine()){
				adjectives.add(scan.nextLine());
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
		}
	}

	public String getRandomVerb()
	{
		int num1 = (int)((Math.random())*(verbs.size() - 1));
	
		return verbs.get(num1);
	}
	
	public String getRandomNoun()
	{
		int num2 = (int)((Math.random())*(nouns.size() - 1));
		
		return nouns.get(num2);
	}
	
	public String getRandomAdjective()
	{
		int num3 = (int)((Math.random())*(adjectives.size() - 1));
		
		return adjectives.get(num3);
	}		

	public String toString()
	{
		String output = "";
	   return output;
	}
}