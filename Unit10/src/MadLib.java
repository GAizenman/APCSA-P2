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
				String symbol = file.next();
				
				if(symbol.equals("#")){
					out.print(getRandomNoun() + " ");
				}
				
				else if(symbol.equals("@")){
					out.print(getRandomVerb() + " ");
				}
				
				else if(symbol.equals("!")){
					out.print(getRandomAdjective() + " ");
				}
			}
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
		
			Scanner scan = new Scanner(new File("nouns.dat"));
			while (scan.hasNextLine()){
				nouns.add(scan.nextLine());
			}
		
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
	
			Scanner scan = new Scanner(new File("verbs.dat"));
			while (scan.hasNextLine()){
				verbs.add(scan.nextLine());
			}
	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
	
			Scanner scan = new Scanner(new File("adjectives.dat"));
			while (scan.hasNextLine()){
				adjectives.add(scan.nextLine());
			}
			
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		int num1 = (int)Math.random()*(verbs.size() + 0);
	
		return verbs.get(num1);
	}
	
	public String getRandomNoun()
	{
		int num2 = (int)Math.random()*(nouns.size() + 0);
		
		return nouns.get(num2);
	}
	
	public String getRandomAdjective()
	{
		int num3 = (int)Math.random()*(adjectives.size() + 0);
		
		return adjectives.get(num3);
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}