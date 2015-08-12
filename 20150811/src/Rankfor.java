import java.util.Scanner;
public class Rankfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           int i = scn.nextInt();
           int sum= 1;
           for(int j=1;j<=i;j++){
        	   sum*=j;
           }
           System.out.println(sum);
	}

}
