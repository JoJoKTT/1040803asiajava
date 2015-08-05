import java.util.Scanner;
public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           int A = scn.nextInt();
           int B = scn.nextInt();
           if((A==1 && B<=20 && B>=1) || (A==12 && B>=21 && B<=31) ){
        	   System.out.println("摩羯座：喜歡沉醉於自己的世界");
           }else{
        	   if((A==2 && B<=19 && B>=1) || (A==1 && B>=21 && B<=31) ){
        		   System.out.println("水瓶座：難為自己，不想對方難過");
        	   }else{
        		   if((A==3 && B<=20 && B>=1) || (A==2 && B>=20 && B<=29) ){
        			   System.out.println("雙魚座：愛放低自己的脾氣");
        		   }else{
        			   if((A==4 && B<=19 && B>=1) || (A==3 && B>=21 && B<=31) ){
        				   System.out.println("牡羊座：講義氣夠朋友");
        			   }else{
        				   if((A==5 && B<=20 && B>=1) || (A==4 && B>=20 && B<=30) ){
        					   System.out.println("金牛座：真性情，愛恨分明");
        				   }else{
        					   if((A==6 && B<=21 && B>=1) || (A==5 && B>=21 && B<=31) ){
        						   System.out.println("雙子座：愛情的執著者");
        					   }else{
        						   if((A==7 && B<=22 && B>=1) || (A==6 && B>=22 && B<=29) ){
        							   System.out.println("巨蟹座：容易受傷、容易滿足");
        						   }else{
        							   if((A==8 && B<=22 && B>=1) || (A==7 && B>=23 && B<=31) ){
        								   System.out.println("獅子座：不喜歡做決定");
        							   }else{
        								   if((A==9 && B<=22 && B>=1) || (A==8 && B>=23 && B<=31) ){
        									   System.out.println("處女座：很害怕孤單，細心溫柔");
        								   }else{
        									   if((A==10 && B<=23 && B>=1) || (A==9 && B>=23 && B<=30) ){
        										   System.out.println("天秤座：有善辯的口才");
        									   }else{
        										   if((A==11 && B<=21 && B>=1) || (A==10 && B>=24 && B<=31) ){
        											   System.out.println("天蠍座：嘴雖毒，心很善");
        										   }else{
        											   if((A==12 && B<=20 && B>=1) || (A==11 && B>=22 && B<=30) ){
        											   System.out.println("射手座：朋友很多，桃花運很旺");
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
