import java.util.Scanner;
public class Biggerorsmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("�п�JA��");
           float A = scn.nextFloat();
           System.out.println("�п�JB��");
           float B = scn.nextFloat();
           if(A>B){
        	   System.out.println(""+A+">"+B+"");
           }else{
        	   if(A<B){
        		   System.out.println(""+A+"<"+B+"");
        	   }else{
        		   System.out.println(""+A+"="+B+"");
        	   }
        	   
           }
	}

}
