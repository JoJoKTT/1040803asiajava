import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.print("請輸入半徑");
           final float pi = 3.1415926f;
           float s = scn.nextFloat();
           float a = pi*s*s;
           System.out.print("面積為"+a);
	}

}
