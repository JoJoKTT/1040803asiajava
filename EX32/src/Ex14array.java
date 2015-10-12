import java.util.Scanner;
public class Ex14array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int w=scn.nextInt();
		int h=scn.nextInt();
		F(w,h);
	}
	public static void F(int m,int n){
		int[][] a=new int[m][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				int k=(i+1)*(j+1);
				a[j][i]=k;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(a[j][i]+" ");
			}System.out.println();
		}System.out.println();
	}
}
