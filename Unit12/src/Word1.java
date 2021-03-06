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
			if (vowels.indexOf(word.substring(i, i+1)) >= 0){
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
		String alp = "abcdefghijklmnopqrstuvwxyz";
		/*if (cool.size() == 0)
			cool.add(word);*/
		for (int i = 0; i < cool.size(); i++){
			Word1 haha = new Word1(cool.get(i));
			if (rhs.numVowels() > haha.numVowels()){
				num ++;
			}
			else if (rhs.numVowels() == haha.numVowels()){
				if (alp.indexOf(rhs.getWord().substring(0,1)) > alp.indexOf(cool.get(i).substring(0,1))){
					num ++;
				}
			}
		}
		
		cool.add(num, rhs.getWord());
		return -1;
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < cool.size(); i++){
			output = output + "\n" + cool.get(i);
		}
		return output;
	}

	@Override
	public int compareTo(Word o) {
		// TODO Auto-generated method stub
		return 0;
	}

}