import java.util.Scanner;
public class Trapezoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.print("�п�J�W��");
           float u = scn.nextFloat();
           System.out.print("�п�J�U��");
           float d = scn.nextFloat();
           System.out.print("�п�J��");
           float h = scn.nextFloat();
           float a = (u+d)*h/2;
           System.out.print("���n��"+a);
	}

}