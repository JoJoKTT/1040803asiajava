import java.util.Scanner;
public class Ex30math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a=0,m=0,z=0;
		for(int i=0;i<6;i++){
			int n=scn.nextInt();
			if(n<0){
				m++;
			}else if(n>0){
				a++;
			}else if(n==0){
				z++;
			}
		}
		System.out.println("-"+m+" +"+a+" 0 "+z);
	}

}
