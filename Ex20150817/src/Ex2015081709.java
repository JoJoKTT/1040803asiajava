import java.util.Scanner;
public class Ex2015081709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		float n=scn.nextInt();
		System.out.print(fac(n));
	}
	public static float fac(float n){
		int result=0;
		for(int i=1;i<=n;i++){
			result+=1.0/((2*i-1)*(2*i));
		}return result;
	}
}
