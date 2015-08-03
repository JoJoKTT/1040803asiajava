import java.util.Scanner;
public class Trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.print("請輸入底");
           float b = scn.nextFloat();
           System.out.print("請輸入高");
           float h = scn.nextFloat();
           float a = b*h/2;
           System.out.print("面積為"+a);
        		   
	}

}
