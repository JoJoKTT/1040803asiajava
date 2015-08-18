import java.util.Scanner;
public class Ex2015081710 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.print(fac(n));
	}
	public static int fac(int n){
		int result=0;
		for(int i=1;i<=n;i++){
			double k=Math.pow(2,i);
			result+=k;
		}return result;
	}
}
