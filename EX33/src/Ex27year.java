import java.util.Random;
import java.util.Scanner;
public class Ex27year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Random ran=new Random();
		for(int i=0;i<3;i++){
			int year=scn.nextInt();
			if(year%4==0 && year%100!=0||year%400==0){
				System.out.println("¶|¦~");
			}else{
				System.out.print("¥­¦~");
			}
		}
	}

}
