import java.util.Scanner;
public class Epuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("�п�JA��");
           int A = scn.nextInt();
           System.out.println("�п�JB��");
           int B = scn.nextInt();
           System.out.println("�A�n+,-,*��/�O?");
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
