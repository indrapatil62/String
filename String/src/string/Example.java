package string;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		System.out.println("Enter the State Name : ");
		Scanner sc=new Scanner(System.in);
		String StateName= sc.next();
		String State=StateName.toUpperCase();
		if (State.equals("MAHARASHTRA")) {
			System.out.println("Namaskar Maharashtrian");
		}
		else if  (State.equals("KARNATAKA")) {
			System.out.println("Namaskaram Kannadiga");
		}
		else if (State.equals("ANDRAPRADESH")) {
			System.out.println("Vannakam Madrasi");
		}
		else {
			System.out.println("Application Not Support For"+" "+State);
		}
	}

}
