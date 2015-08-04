import java.util.Scanner;
public class Epuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("請輸入A值");
           int A = scn.nextInt();
           System.out.println("請輸入B值");
           int B = scn.nextInt();
           System.out.println("你要+,-,*或/呢?");
           String str = scn.next();
           int C;
           if(str.equals("+")){
        	   C=A+B;
        	   System.out.println(""+C+"="+A+"+"+B+"");
           }else{
        	   if(str.equals("-")){
        		   C=A-B;
        		   System.out.println(""+C+"="+A+"-"+B+"");
        	   }else{
        		   if(str.equals("*")){
        			   C=A*B;
        			   System.out.println(""+C+"="+A+"*"+B+"");
        		   }else{
        			   C=A/B;
        			   System.out.println(""+C+"="+A+"/"+B+"");
        		   }
        	   }
           }
           
	}

}
