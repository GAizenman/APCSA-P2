//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name1, int stuCount)
	{

		name = name1;
		studentList = new Student[stuCount];
		
	}
	
	public void addStudent(int stuNum, Student s)
	{

		studentList[stuNum] = s;

	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		double tot = 0.0;
		for (int i = 0; i < studentList.length; i++){
			tot = tot + studentList[i].getAverage();
		}
		classAverage = tot / studentList.length;
		
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{

		for(int i = 0; i < studentList.length; i++){
			if (studentList[i].getName() == stuName){
				return studentList[i].getAverage();
			}
		}
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";

		for (int i = 0; i < studentList.length; i++){
			if (studentList[i].getAverage() > high){
				high = studentList[i].getAverage();
				hName = studentList[i].getName();
			}
		}

		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		

		for (int i = 0; i < studentList.length; i++){
			if (studentList[i].getAverage() < low){
				low = studentList[i].getAverage();
				hName = studentList[i].getName();
			}
		}

		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";

		for (int i = 0; i < studentList.length; i++){
			if (studentList[i].getAverage() < failingGrade){
				output = output + " " + studentList[i].getName();
			}
		}
		
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";

		for(int i = 0; i < studentList.length; i++){
			output = output + studentList[i].toString() + "\t" + studentList[i].getAverage() + "\n";
		}
		return output;
	}  	
}