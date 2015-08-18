import java.util.Scanner;
public class Ex2015081705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long x=scn.nextLong();
		long y=scn.nextLong();
		long z=scn.nextLong();
		System.out.print(gcd(x,y,z));
	}
	public static long gcd(long x,long y,long z){
			if(y==0){
			return x;
			}
			if(z==0){
			return gcd(y,x%y,0);
			}else{
			return gcd(x,z,y%z);
		}
	}
}
