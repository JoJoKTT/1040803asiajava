import java.util.Scanner;
public class EX003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		if(a>0&&a%2==0){
			System.out.println("Even");
		}else{
				System.out.println("Odd");
		}
	}

}
