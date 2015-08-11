import java.util.Scanner;
import java.util.Random;
public class Array {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           Random rnd = new Random();
           int v1=0;//v1是偶數總和
           int a[] = new int[10];
           for(int i=0;i<10;i++){
           a[i]=rnd.nextInt(100);
       	       if(a[i]%2==0){
    		     v1++;
       	}
    }
           int t=1;
           while(t<4){
        	   System.out.println("猜");
        	   int ans =scn.nextInt();
        	   if(ans==v1){
        		   System.out.println("恭喜你答對了。");
        		   t=5;
        	   }else{
        		   t++;
        		   if(t==4){
        			   System.out.println("You Lose~~");
        		   }
        	   }
        	   }
    	   for(int i=0;i<10;i++){
    		   System.out.println(a[i]);
           }
	}
}
