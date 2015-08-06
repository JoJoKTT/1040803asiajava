import java.util.Scanner;
public class oddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           int sum = 0;
           int i = 13;
           for(i=13;i<=1399;i=i+2){
        	   sum=sum+i;
           }
           System.out.println("sum="+sum);
	}

}
