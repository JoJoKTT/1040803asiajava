import java.util.Random;
public class Ex29money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int m=ran.nextInt(999)+1;
		int a=m/1000;
		int b=m%1000/100;
		int c=m%100/10;
		int d=m%10/1;
		System.out.println(a+" thousand "+b+" hundred "+c+" ten "+d+" one");
	}

}
