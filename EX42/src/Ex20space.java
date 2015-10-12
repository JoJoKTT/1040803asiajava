import java.util.Scanner;
public class Ex20space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		decomp(a);
	}
	public static void decomp(int x){
		String str=Integer.toString(x);
		char a[]=str.toCharArray();
		for(int i=0;i<str.length();i++){
			System.out.print(a[i]+" ");
		}
	}
}
