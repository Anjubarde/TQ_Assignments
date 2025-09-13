package HomeWork_TQ;

/*
2. Class student is as follows { private int sid, private string name , private int[] marks ,
float per}. Create array of 3 students. Hardcode data. Marks array is array of 3
integers which represent students marks of 3 subjects. Marks are out of 100. Strictly
use getter and setters to set and read values of all fields. Calculate percentage. Sort
array in descending order of percentage. [1M]
*/

public class Question_2 
{
	public static void main(String[] args)
	{
		// Create array of 3 students
		Student[] students = new Student[3];
		
		// Hardcode data
		int[][] allMarks = {
				{34, 56, 78},
				{12, 45, 98},
				{45, 86, 32}
		};
		
		String[] names = {"Anjali","Pratiksha","Mayur"};
		int sids = {1,2,3};
		
		for(int i = 0; i < students.length; i++)
		{
			students[i] = new Student();
			students[i].setSid(sids[i]);
			students[i].setName(names[i]);
			students[i].setMarks(allMarks[i]);
			students[i].setPercentage();
			
		}
	}
}
