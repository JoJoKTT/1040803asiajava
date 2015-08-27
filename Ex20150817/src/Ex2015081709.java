import java.util.Scanner;
public class Ex2015081709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		float n=scn.nextInt();
		float result=0f;
		System.out.print(fac(n,result));
	}
	public static float fac(float n,float m){
		for(int i=1;i<=n;i++){
			m+=1.0/((2*i-1)*(2*i));
		}return m;
	}
}
