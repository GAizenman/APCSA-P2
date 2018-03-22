//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private int len;

	public Maze()
	{
		hasExitPath(0, 0);
		len = 0;


	}

	public Maze(int size, String line)
	{
		len = size;
		int lol = 0;
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				if (line.charAt(lol) == '1'){
					maze[i][j] = 1;
					lol++;
				}
				else{
					maze[i][j] = 0;
					lol++;
				}
				
			}
		}


	}

	public boolean hasExitPath(int r, int c)
	{
		if (r >= 0 && c >= 0 && c < len && r < len){
			maze[r][c] = 0;
			if (c == 5)
				return true;
			else{
				hasExitPath(r+1, c);
				hasExitPath(r-1, c);
				hasExitPath(r, c+1);
				hasExitPath(r, c-1);
			}
		}

		return false;
	}

	public String toString()
	{
		String output = "";
		for(int i = 0; i < len; i++){
			for(int j = 0; j < len; j++){
				output += maze[i][j] + " ";
				if (j == len)
					output += "/n";
			}
		}
		output += "/n";
		if (hasExitPath(0, 0))
			output += "exit found";
		else
			output += "exit not found";
		
		return output;
	}
}