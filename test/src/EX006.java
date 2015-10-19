import java.util.Scanner;
public class EX006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int s=scn.nextInt();
		int h=scn.nextInt();
		if(s==1){
			System.out.println((h-170)*0.6+62);
		}else if(s==2){
			System.out.println((h-158)*0.5+52);
		}
	}

}
