import java.util.Scanner;
import java.util.Random;
public class Arraynotagain {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int i=0,v1=0;
        int[] a = new int[10];
        boolean flag = false;
        while(i<10){
        	a[i]=rnd.nextInt(100)+1;
        	flag=false;
        	for(int j=0;j<i;j++){
        		if(a[i] == a[j]){
        			flag=true;
        		}
        		}
    	       if(a[i]%2==0){
 		     v1++;
    	}
        	if(flag==false){
        			i++;
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
        for(i=0;i<10;i++){
    	System.out.println(a[i]);
	}
	}
}
