import java.util.Scanner;
public class NewMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn= new Scanner(System.in);
           System.out.println("請輸入0~9的數字");
       	   long n=scn.nextLong();
           int sum =(int)fun(n);
           System.out.println("總合為"+sum);
	}
	public static int fun(long k){
		int sum1=0;
		while(k>0){
			sum1+=k%10;
			k=k/10;
		}return sum1;
	}
}