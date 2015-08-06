import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           int sum = 0;
           int n;
           for(n=13;n<=1399;n=n+1){
        	   sum = sum+n;
           }
           System.out.println("sum ="+sum);
	}

}
