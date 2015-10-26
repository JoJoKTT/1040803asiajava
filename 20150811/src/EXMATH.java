import java.util.Scanner;
public class EXMATH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long m=scn.nextLong();
		int n=0;
		while(m>0){
			m/=10;
			n++;
		}
		System.out.println(n);
	}

}
