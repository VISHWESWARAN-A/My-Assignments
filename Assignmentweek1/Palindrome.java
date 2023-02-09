package Assignmentweek1;

public class Palindrome {
	public static void main(String[] args) {
		int num= 34343;
		int sum=0,r;
		for (int i=num; i <0; i++) {
			r=i%10;
			sum=sum*10+r;
			i=i/10;
		
		}
		if(sum==num)
		{
			System.out.println("not palindrome "+num);
			
		}
		else
		{
			System.out.println("palindrome " +num);
		}
	}
}

