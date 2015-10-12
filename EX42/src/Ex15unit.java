import java.util.Scanner;
public class Ex15unit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float h=scn.nextFloat();
		float w=scn.nextFloat();
		float ch=0f,cw=0f;
		ch=(float) (h/2.54);
		cw=(float) (w/0.454);
		System.out.println(ch);
		System.out.println(cw);
	}

}
