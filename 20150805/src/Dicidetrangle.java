import java.util.Scanner;
public class Dicidetrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           float a = scn.nextFloat();
           float b = scn.nextFloat();
           float c = scn.nextFloat();
           if(a*a+b*b==c*c){
        	   System.out.println("�������T����");
           }else{
        	   if(a*a+b*b>c*c){
        		   System.out.println("���U���T����");
        	   }else{
        		   System.out.println("���w���T����");
        	   }
           }
	}

}
