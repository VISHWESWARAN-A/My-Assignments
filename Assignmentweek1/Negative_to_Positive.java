package Assignmentweek1;

public class Negative_to_Positive {
	public static void main(String[] args) {
		int num=-40;
		int convert;
		if(num<0)
		{
			System.out.println("This is a negative number " +num);
			convert=Math.abs(num);
			System.out.println("The number " +num+ " is converted to " +convert);
			System.out.println();
		}
	}

}
