import java.util.Scanner;
public class Ex31M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		while(true){
			float x=scn.nextFloat();
			float y=0,z=0;
			if(x<-1){
				z=-1f;
			}else if(x>=-1&&x<=1){
				z=0f;
			}else if(x>1){
				z=1f;
			}else{
				x=(Integer) null;
			}
			switch((int)z){
			case -1:
				y=(int) (3*(Math.pow(x,2)));
				System.out.println(y);
				break;
			case 0:
				y=(int) ((Math.pow(x,3))+3*x-3);// x^3 + 3 * x - 3
				System.out.println(y);
				break;
			case 1:
				y=(int) ((2*x)+3);
				System.out.println(y);
				break;
			}
		}
	}

}
