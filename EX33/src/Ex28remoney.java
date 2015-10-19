import java.util.Random;
public class Ex28remoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int n=ran.nextInt(999)+1;
		int m=1000-n;
		int a=m/500;
		int b=m%500/100;
		int c=m%100/50;
		int d=m%50/10;
		int e=m%10/5;
		int f=m%5/1;
		System.out.println(a+" 500\n"+b+" 100\n"+c+" 50\n"+d+" 10\n"+e+" 5\n"+f+" 1");
	}

}
