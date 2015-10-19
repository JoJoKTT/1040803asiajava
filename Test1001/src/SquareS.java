import java.util.Scanner;
public class SquareS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請問有多少數字?");
		int m=scn.nextInt();
		System.out.println("請輸入數字");
		int a[]=new int[m];
		for(int i=0;i<m;i++){
			a[i]=scn.nextInt();
		}
		Square(m,a);
	}
	public static void Square(int m,int arr[]){
		for(int i=0;i<m;i++){
			arr[i]=(int) Math.pow(arr[i], 2);
		}
		System.out.print(arr);
	}
}
