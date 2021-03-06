//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	import static java.lang.System.*;
	import static java.util.Arrays.*;
	import java.util.ArrayList;

public class Word implements Comparable<Word>
{
	private String word;
	private ArrayList<String> cool;

	public Word( String s )
	{

		setWord(s);
		cool = new ArrayList<String>();

	}
	
	public void setWord(String s){
		
		word = s;
		
	}
	
	public String getWord(){
		return word;
	}

	public int compareTo( Word rhs )
	{
		int num = 0;
		String alp = "abcdefghijklmnopqrstuvwxyz";
		/*if (cool.size() == 0)
			cool.add(word);*/
		for (int i = 0; i < cool.size(); i++){
			if (rhs.getWord().length() > cool.get(i).length()){
				num ++;
			}
			else if (rhs.getWord().length() == cool.get(i).length()){
				if (alp.indexOf(rhs.getWord().substring(0,1)) > alp.indexOf(cool.get(i).substring(0,1))){
					num ++;
				}
			}
		}
		
		
		cool.add(num, rhs.getWord());
		
		return num;
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < cool.size(); i++){
			output = output + "\n" + cool.get(i);
		}
		return output;
	}
}