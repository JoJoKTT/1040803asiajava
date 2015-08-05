import java.util.Scanner;
public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           int kk = scn.nextInt();
           int cm = scn.nextInt();
           int h = scn.nextInt();
           if(kk>43 && cm>130 && h==12){
        	   System.out.println("�");
           }else{
        	   System.out.println("銝");
           }
	}

}
