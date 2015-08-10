import java.util.Scanner;
public class Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           float n = 5000000.0f;
           float w = n*0.78f;
           float dropw = 20000.0f;
           float a = 0.0f;
           int t = 0;
           while(a<5000000.0){
        	   a=w+dropw;
        	   dropw = dropw + dropw*0.15f;
        	   t++;
        	   System.out.println(a);
        	   System.out.println(dropw);
           }
           System.out.print(a);
           System.out.print("花了"+t+"小時");
	}

}
