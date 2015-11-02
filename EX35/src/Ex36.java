import java.util.Scanner;
public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int sum=1,i=1;
		while(i<=n){
			sum*=i;
			i++;
		}
		System.out.println(sum);
	}

}
