package MidtermExam1;
import java.text.NumberFormat;
import java.util.Scanner;
public class Number24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of money you spent on food last week: ");
		int X = scan.nextInt();
		NumberFormat c = NumberFormat.getCurrencyInstance();
		NumberFormat p = NumberFormat.getPercentInstance();
		double T = .06;
		System.out.println("Tax rate of Kentucky is: "+ p.format(T));
		System.out.println("You spent "+c.format(X)+" on food last week");
	}

}
