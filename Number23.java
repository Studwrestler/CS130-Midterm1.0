package MidtermExam1;
import java.util.Scanner;
public class Number23 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the x value: ");
		int x = scan.nextInt();
		double y = (0.5*Math.pow(x,3)- Math.pow(x, 2)+1);
		System.out.println(y);
	}
}