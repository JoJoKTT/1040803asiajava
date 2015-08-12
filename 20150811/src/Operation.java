import java.util.Scanner;
public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int j = scn.nextInt();
        int sum=0;
        for(int i=1;i<=j;i++){
        	sum+=(i*(i+1));
        }
        System.out.println("sum="+sum);
	}

}
