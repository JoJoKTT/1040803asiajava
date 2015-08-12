import java.util.Scanner;
import java.util.Random;
public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn=new Scanner(System.in);
           Random ran=new Random();
           int i=0,j=0;
           int[] a=new int[5];
           int[] a1=new int[5];
           for(i=0;i<5;i++){
        	   a[i]=ran.nextInt(101);
        	   for(j=0;j<i;j++){
        		   if(a[i]==a[j]){
        			   i--;
        		   }
        	   }
           }
           for(i=0;i<5;i++){
        	   for(j=i+1;j<5;j++){
        		   if(a[i]>a[j]){
        			   int v1=a[i];
        			   a[i]=a[j];
        			   a[j]=v1;
        		   }
        	   }
           }
           for(i=0;i<5;i++){
        	   a1[i]=scn.nextInt();
           }
           for(i=0;i<5;i++){
        	   for(j=i+1;j<5;j++){
        		   if(a1[i]>a1[j]){
        			   int v1=a1[i];
        			   a1[i]=a1[j];
        			   a1[j]=v1;
        		   }
        	   }
           }
           if(a[2]>a1[2]){
        	   System.out.println("You Lose");
           }else{
        	   if(a[2]<a1[2]){
        		   System.out.println("You Win");
        	   }else{
        		   System.out.println("Draw");
        	   }
	}
	}
}
