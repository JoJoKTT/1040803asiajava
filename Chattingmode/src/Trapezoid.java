import java.util.Scanner;
public class Trapezoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.print("請輸入上底");
           float u = scn.nextFloat();
           System.out.print("請輸入下底");
           float d = scn.nextFloat();
           System.out.print("請輸入高");
           float h = scn.nextFloat();
           float a = (u+d)*h/2;
           System.out.print("面積為"+a);
	}

}
