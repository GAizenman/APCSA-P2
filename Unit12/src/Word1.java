//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.ArrayList;

public class Word1 implements Comparable<Word>
{
	private String word;
	private ArrayList<String> cool;

	public Word1( String s)
	{

		setWord(s);
		cool = new ArrayList<String>();

	}

	private void setWord(String s){
		word = s;
	}
	
	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vc=0;
		
		for(int i = 0; i < word.length(); i++){
			if (vowels.indexOf(word.charAt(1)) >= 0){
				vc ++;
			}
		}

		return vc;
	}
	
	public String getWord(){
		return word;
	}

	public int compareTo(Word1 rhs)
	{

		int num = 0;
		Word1 lol = new Word1();
		if (cool.size() == 0)
			cool.add(word);
		for (int i = 0; i < cool.size(); i++){
			if (rhs.numVowels() > cool.get(i).numVowels()){
				num ++;
			}
		}
		
		cool.add(num, rhs.getWord());
		return -1;
	}

	public String toString()
	{
		return word;
	}
}