import java.util.Scanner;
public class Ex2015081703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n=scn.nextLong();
		System.out.print(fac(n));
	}
	public static long fac(long v1){
		if(v1<10&&v1>0){
			return 1;
		}else{
			return 1+fac(v1/10);
		}
	}
}
