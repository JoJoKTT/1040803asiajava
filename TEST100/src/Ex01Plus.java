import java.util.Scanner;
public class Ex01Plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String num=scn.next();
		int sum=0;
		int len=num.length();
		char[] a=num.toCharArray();
		for(int i=0;i<len;i++){
			int c=a[i]-'0';
			sum=sum+c;
		}
		System.out.print(sum);
	}

}
