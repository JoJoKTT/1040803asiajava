import java.util.Scanner;
public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           int w = scn.nextInt();
           String str = "";
           if(w<1 || w>7){
        	   System.out.println("沒有這天喔");
           }else{
           switch(w){
        	   case 1:
        		   str = "Monday"; break;
        	   case 2:
        		   str = "Tuesday"; break;
        	   case 3:
        		   str = "Wednesday"; break;
        	   case 4:
        		   str = "Thursday"; break;
        	   case 5:
        		   str = "Friday"; break;
        	   case 6:
        		   str = "Saturday"; break;
        	   case 7:
        		   str = "Sunday"; break;
           }
           System.out.println("第"+ w +"天的英文是"+ str);
	}
	}
}
