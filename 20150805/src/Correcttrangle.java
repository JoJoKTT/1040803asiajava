import java.util.Scanner;
public class Correcttrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           float a = scn.nextFloat();
           float b = scn.nextFloat();
           float c = scn.nextFloat();
           if(a+b>c){
        	   System.out.println("合法");
           }else{
        	   System.out.println("不合法");
           }
	}

}
