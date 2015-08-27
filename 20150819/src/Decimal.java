import java.util.Scanner;
public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		if(m<1&&m>=10){
			System.out.print("¿ù»~");
		}else if(m>1&&m<10){
		fac(n,m);}
	}
	public static void fac(int n,int m){
		String str="";
		while(n>=m){
			str=Integer.toString(n%m)+str;
			n/=m;}
		if(n<=m){
		str=Integer.toString(n)+str;
		}System.out.println(str);
	}
}
