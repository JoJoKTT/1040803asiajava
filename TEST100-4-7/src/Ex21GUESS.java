import java.util.Scanner;
import java.util.Random;

public class Ex21GUESS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		int m = ran.nextInt(5) + 1;
		int n = scn.nextInt();
		System.out.print(m);
		if (m == n) {
			System.out.print("�A�q��F!!");
		} else {
			System.out.print("�@�q���F");
		}
	}

}
