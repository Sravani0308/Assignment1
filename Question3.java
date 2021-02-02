package assignment1;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=t.nextInt();
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}

}
