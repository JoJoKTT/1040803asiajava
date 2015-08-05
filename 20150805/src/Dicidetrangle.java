import java.util.Scanner;
public class Dicidetrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           float a = scn.nextFloat();
           float b = scn.nextFloat();
           float c = scn.nextFloat();
           if(a*a+b*b==c*c){
        	   System.out.println("為直角三角形");
           }else{
        	   if(a*a+b*b>c*c){
        		   System.out.println("為銳角三角形");
        	   }else{
        		   System.out.println("為鈍角三角形");
        	   }
           }
	}

}
