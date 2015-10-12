import java.util.Random;
public class Ex23maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Random ran = new Random();
           int[] a=new int[3];
           int i=0,j=0;
           int max=0,min=999;
           for(i=0;i<3;i++){
        	   a[i]=ran.nextInt(100)+1;
        	   for(j=0;j<i;j++){
        		   if(a[i]==a[j]){
        			   i--;
        		   }
        	   }
           }
           for(i=0;i<3;i++){
               System.out.print(a[i]+"\t");
        	   if(a[i]>max){
        		   max=a[i];
        	   }else if(a[i]<min){
        		   min=a[i];
        	   }
           }
           System.out.println();
           System.out.println("最大值為"+max);
           System.out.println("最小值為"+min);
	}

}
