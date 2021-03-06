
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

	public class ClassList
	{
		private String name;
		private ArrayList<Student> studentList;
		
		public ClassList()
		{
			name="";
			studentList=new ArrayList<Student>();
		}
		
		public ClassList(String name1, int stuCount)
		{

			name = name1;
			studentList = new ArrayList<Student>();
			
		}
		
		public void addStudent(int stuNum, Student s)
		{

			studentList.add(stuNum, s);

		}
		
		public String getClassName()
		{
		   return name;	
		}
		
		public double getClassAverage()
		{
			double classAverage=0.0;
			double tot = 0.0;
			for (int i = 0; i < studentList.size(); i++){
				tot = tot + studentList.get(i).getAverage();
			}
			classAverage = tot / studentList.size();
			
			return classAverage;
		}
		
		public double getStudentAverage(int stuNum)
		{
			return studentList.get(stuNum).getAverage();
		}

		public double getStudentAverage(String stuName)
		{

			for(int i = 0; i < studentList.size(); i++){
				if (studentList.get(i).getName() == stuName){
					return studentList.get(i).getAverage();
				}
			}
			return 0.0;
		}
		
		public String getStudentName(int stuNum)
		{
			return studentList.get(stuNum).getName();
		}

		public String getStudentWithHighestAverage()
		{
			/*
			double high = Double.MIN_VALUE;
			String hName ="";

			for (int i = 0; i < studentList.length; i++){
				if (studentList[i].getAverage() > high){
					high = studentList[i].getAverage();
					hName = studentList[i].getName();
				}
			}

			return hName;
			*/
			int index = 0;
			for (int i = 0; i < studentList.size() - 1; i++) {
				if (studentList.get(index).compareTo(studentList.get(i + 1)) == -1){
					index = i + 1;
				}
			}
			return studentList.get(index).getName();
		}

		public String getStudentWithLowestAverage()
		{
			/*double low = Double.MAX_VALUE;
			String hName ="";		

			for (int i = 0; i < studentList.length; i++){
				if (studentList[i].getAverage() < low){
					low = studentList[i].getAverage();
					hName = studentList[i].getName();
				}
			}

			return hName;
			*/
			int index = 0;
			for (int i = 0; i < studentList.size() - 1; i++) {
				if (studentList.get(index).compareTo(studentList.get(i + 1)) == 1){
					index = i + 1;
				}
			}
			return studentList.get(index).getName();
		}
		
		public String getFailureList(double failingGrade)
		{
			String output="";

			for (int i = 0; i < studentList.size(); i++){
				if (studentList.get(i).getAverage() < failingGrade){
					output = output + " " + studentList.get(i).getName();
				}
			}
			
			return output;
		}
		
		public void sorting()
		{
			Collections.sort(studentList, Collections.reverseOrder());
		}
		
		public String toString()
		{
			String output=""+getClassName()+"\n";

			for(int i = 0; i < studentList.size(); i++){
				output = output + studentList.get(i).toString() + "\t" + studentList.get(i).getAverage() + "\n";
			}
			return output;
		}  	
	}
