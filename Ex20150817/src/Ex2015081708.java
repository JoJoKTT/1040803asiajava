import java.util.Scanner;
public class Ex2015081708 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int sum = 0;
		System.out.print(fac(n,sum));
	}
	public static int fac(int n,int m){
		if(n==0){
			return m; 
		}else{
			return fac(n-1,m+=n*(n+1));
		}
	}
}
