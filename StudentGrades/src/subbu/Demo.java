package subbu;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your score");
		int score = scan.nextInt();
		
		Grades s1=new Grades();
		s1.Grading(score);
		
		

	}

}
