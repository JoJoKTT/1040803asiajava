import java.util.Scanner;
public class EXTRA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int i=0;
		while(i<n){
			int j=0,k=0;
			while(j<n-i-1){
				System.out.print(" ");
				j++;
			}
			while(k<=i){
				System.out.print("*");
				k++;
			}System.out.println();
			i++;
		}
	}

}
