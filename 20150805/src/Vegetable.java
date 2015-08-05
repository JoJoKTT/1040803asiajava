import java.util.Scanner;
public class Vegetable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
		   int day = scn.nextInt();
           int date = scn.nextInt();
           if(day==7 || day==17 || day==27 && day>0 && day<=31){
        	   System.out.println("不吃素");
           }else{
        	   if(date==2 || date==4 ||date==6 && date>=1 && date<=7){
        	   System.out.println("吃素");
        	   }else{
        		   System.out.println("不吃素");
        	   }
           }
	}

}
