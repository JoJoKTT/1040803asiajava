import java.util.Random;
public class Maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Random ran = new Random();
           int[] a=new int[3];
           int i=0,j=0;
           for(i=0;i<3;i++){
        	   a[i]=ran.nextInt(5)+1;
        	   for(j=0;j<i;j++){
        		   if(a[i]==a[j]){
        			   i--;
        		   }
        	   }
           }
           for(i=0;i<3;i++){
        	   for(j=i+1;j<3;j++){
        		   if(a[i]>a[j]){
        			   int v1=a[i];
        			   a[i]=a[j];
        			   a[j]=v1;
        		   }
        	   }
           }
           for(i=0;i<3;i++){
        	   System.out.println(a[i]);
           }
           for(i=0;i<3;i++){
        	   System.out.println("min="+a[0]+"\tmax="+a[2]);
           }
	}

}
