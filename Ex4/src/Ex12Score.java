import java.util.Scanner;
public class Ex12Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int s=scn.nextInt();
		int sum=0;
		int suma=0,sumb=0,sumc=0;
		int a[]=new int[s];
		int b[]=new int[s];
		int c[]=new int[s];
		for(int i=0;i<s;i++){
			a[i]=scn.nextInt();
			b[i]=scn.nextInt();
			c[i]=scn.nextInt();
		}
		for(int i=0;i<s;i++){
			sum=a[i]+b[i]+c[i];
			System.out.println(sum);
			suma+=a[i];
			sumb+=b[i];
			sumc+=c[i];
		}
		for(int i=0;i<s;i++){
			System.out.println(suma+"\t"+sumb+"\t"+sumc);
			i=s;
		}
	}

}
