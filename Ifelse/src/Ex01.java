import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           float H = scn.nextFloat();
           float W = scn.nextFloat();
           if(H>=165 && W<=45){
        	   System.out.println("Come on Baby!");
           }else{
        	   System.out.println("Get out!");
           }
	}

}
