import java.util.Scanner;
public class Ex34ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		if(t<=600){
			System.out.println(t*0.5+"¤¸");
		}else if(t>600&&t<1200){
			System.out.println(0.9*(t*0.5)+"¤¸");
		}else if(t>=1200){
			System.out.println(0.79*(t*0.5)+"¤¸");
		}
	}

}
