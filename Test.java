package MidtermExam1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length(cm):");
		int l = scan.nextInt();
		System.out.println("Enter the hight (cm):");
		int h = scan.nextInt();
		System.out.println("Enter the width(cm):");
		int w = scan.nextInt();
		int v = l*w*h;
		System.out.println("The volume of the cuboid is "+ v +" centimeters cubed");

	}

}
