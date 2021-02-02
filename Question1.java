package assignment1;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
	 Scanner t=new Scanner(System.in);
	 System.out.println("Enter a color");
	 char color=t.next().charAt(0);
		
		switch(color) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
			case 'G':
				System.out.println("Green");
				break;
			case 'O':
				System.out.println("Orange");
				break;
			case 'Y':
				System.out.println("yellow");
				break;
			case 'W':
				System.out.println("White");
				break;
				default:
					System.out.println("invalid Color");
		}

	}

}
