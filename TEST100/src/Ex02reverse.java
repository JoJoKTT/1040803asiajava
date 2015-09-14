import java.util.Scanner;
public class Ex02reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		int len=str.length();
		char a[]=str.toCharArray();
		char a1[]=new char[len];
		for(int i=0;i<len;i++){
			a1[i]=a[len-i-1];
		}
		System.out.print(a1);
	}

}
