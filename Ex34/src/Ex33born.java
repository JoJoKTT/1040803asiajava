import java.util.Scanner;
public class Ex33born {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           int A = scn.nextInt();
           int B = scn.nextInt();
           if((A==1 && B<=20 && B>=1) || (A==12 && B>=21 && B<=31) ){
        	   System.out.println("¼¯½~®y");
           }else{
        	   if((A==2 && B<=19 && B>=1) || (A==1 && B>=21 && B<=31) ){
        		   System.out.println("¤ô²~®y");
        	   }else{
        		   if((A==3 && B<=20 && B>=1) || (A==2 && B>=20 && B<=29) ){
        			   System.out.println("Âù³½®y");
        		   }else{
        			   if((A==4 && B<=19 && B>=1) || (A==3 && B>=21 && B<=31) ){
        				   System.out.println("¨d¦Ï®y");
        			   }else{
        				   if((A==5 && B<=20 && B>=1) || (A==4 && B>=20 && B<=30) ){
        					   System.out.println("ª÷¤û®y");
        				   }else{
        					   if((A==6 && B<=21 && B>=1) || (A==5 && B>=21 && B<=31) ){
        						   System.out.println("Âù¤l®y");
        					   }else{
        						   if((A==7 && B<=22 && B>=1) || (A==6 && B>=22 && B<=29) ){
        							   System.out.println("¥¨ÃÉ®y");
        						   }else{
        							   if((A==8 && B<=22 && B>=1) || (A==7 && B>=23 && B<=31) ){
        								   System.out.println("·à¤l®y");
        							   }else{
        								   if((A==9 && B<=22 && B>=1) || (A==8 && B>=23 && B<=31) ){
        									   System.out.println("³B¤k®y");
        								   }else{
        									   if((A==10 && B<=23 && B>=1) || (A==9 && B>=23 && B<=30) ){
        										   System.out.println("¤Ñ¯¯®y");
        									   }else{
        										   if((A==11 && B<=21 && B>=1) || (A==10 && B>=24 && B<=31) ){
        											   System.out.println("¤ÑÃÈ®y");
        										   }else{
        											   if((A==12 && B<=20 && B>=1) || (A==11 && B>=22 && B<=30) ){
        											   System.out.println("®g¤â®y");
        										   }
        									   }
        								   }
        							   }
           }
	}
}
}	
}
}	
}	
}	
}
}
