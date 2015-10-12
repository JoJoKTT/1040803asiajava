import java.util.Scanner;
public class Ex26gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		gcd(m,n);
		System.out.print(gcd(m,n));
	}
	public static int gcd(int x,int y){
		if(y==0){
			return x;
		}else{
			return gcd(y,x%y);
		}
	}
}
