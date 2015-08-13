import java.util.Scanner;
public class Arraymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn= new Scanner(System.in);
           System.out.println("請輸入A矩陣n*n");
           int a=scn.nextInt();
           int b=scn.nextInt();
           System.out.println("請輸入B矩陣n*n");
           int c=scn.nextInt();
           int d=scn.nextInt();
           if(b!=c){System.out.println("無法運算");}
           int p=0,q=0;
           float[][] mxp=new float[a][b];
           float[][] pxn=new float[b][d];
           float[][] mxn=new float[a][d];
               for(int i=0;i<a;i++){
                   for(int j=0;j<b;j++){
        		   mxp[i][j]=scn.nextFloat();
        	   }
           }
               for(int j=0;j<c;j++){
                   for(int k=0;k<d;k++){
        		   pxn[j][k]=scn.nextFloat();
	}
           }
           for(int i=0;i<a;i++){
        	   for(int k=0;k<d;k++){
        		   for(int j=0;j<b;j++){
        			   mxn[p][q]+=mxp[i][j]*pxn[j][k];
        		   }q++;
        	   }p++;q=0;
           }
               for(p=0;p<a;p++){
            	   for(q=0;q<d;q++){
        		   System.out.print(mxn[p][q]+"\t");
        	   }
        	   System.out.println();
           }
	}
}
