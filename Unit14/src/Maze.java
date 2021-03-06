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
   private boolean end = false;

	public Maze()
	{
		hasExitPath(0, 0);
		len = 0;


	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		len = size;
		int lol = 0;
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				if (line.charAt(lol) == '1'){
					maze[i][j] = 1;
					lol += 2;
				}
				else{
					maze[i][j] = 0;
					lol += 2;
				}
				
			}
		}


	}

	public void hasExitPath(int r, int c)
	{
		if (r >= 0 && c >= 0 && c < len && r < len && maze[r][c] == 1){
			
			if (c == len - 1)
				end = true;
			else{
				int save = maze[r][c];
				maze[r][c] = 0;
				hasExitPath(r+1, c);
				hasExitPath(r, c+1);
				hasExitPath(r-1, c);
				hasExitPath(r, c-1);
				maze[r][c] = save;
			}
		}

	}

	public String toString()
	{
		String output = "";
		for(int i = 0; i < len; i++){
			for(int j = 0; j < len; j++){
				output += maze[i][j] + " ";
				if (j == len - 1)
					output += "\n";
			}
		}
		if (end == true)
			output += "exit found" + "\n";
		else
			output += "exit not found" + "\n";
		
		return output;
	}
}