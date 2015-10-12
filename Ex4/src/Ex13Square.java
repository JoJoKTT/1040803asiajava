import java.util.Scanner;
public class Ex13Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		char c=scn.next().charAt(0);   
		square(n,c);
	}
	public static void square(int i,char v1){
		char a[][]=new char[i][i];
		for(int j=0;j<i;j++){
			for(int k=0;k<i;k++){
				a[j][k]=v1;
			}
		}
		for(int j=0;j<i;j++){
			for(int k=0;k<i;k++){
				System.out.print(a[j][k]);
			}
			System.out.println();
		}
	}
}
