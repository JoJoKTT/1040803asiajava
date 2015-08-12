import java.util.Scanner;
public class Rankwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           int i = scn.nextInt();
           int sum= 1;
           int j =1;
           while(j<=i){
        	   sum*=j;
        	   j++;
           }
           System.out.println(sum);
	}

}
