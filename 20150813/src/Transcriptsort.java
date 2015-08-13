import java.util.Scanner;
public class Transcriptsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn= new Scanner(System.in);
           System.out.println("請輸入幾位學生?");
           int stu=scn.nextInt();
           int k=0;
           String max=(""),min=("");
           float minva1=9999,maxva1=0;
           float[][] a=new float[stu][4];
           String[] name=new String[stu];
           for(int i=0;i<stu;i++){
        	   System.out.println("請輸入第"+(i+1)+"位學生的名子");
        	   name[i]=scn.next();
        	   System.out.println("請輸入三科成績");
        	   a[i][0]=scn.nextFloat();
        	   a[i][1]=scn.nextFloat();
        	   a[i][2]=scn.nextFloat();
        	   a[i][3]=(a[i][0]+a[i][1]+a[i][2])/3;
           }
           for(int i=0;i<stu;i++){
        	   for(int j=0;j<i;j++){
        		   if(a[i][3]>a[j][3]){
        			   float v1=a[i][3];
        			   a[i][3]=a[j][3];
        			   a[j][3]=v1;
        			   String name1=name[i];
        			   name[i]=name[j];
        			   name[j]=name1;
        		   }
        	   }
           }
           for(int i=0;i<stu;i++){
        	   System.out.println(name[i]+":"+a[i][3]);
           }
           for(int i=0;i<stu;i++){
        	   if(a[i][3]<60){
        		   System.out.println("不及格:"+name[i]);
        		   k++;
        	   }
           }
    	   System.out.println("不及格人數:"+k);
           for(int i=0;i<stu;i++){
        	   if(a[i][3]<minva1){
        		   minva1=a[i][3];
        		   min=name[i];
        	   }
        	   if(a[i][3]>maxva1){
        		   maxva1=a[i][3];
        		   max=name[i];
           }
           }
           System.out.println("最高為"+max+":"+maxva1+"最低為"+min+":"+minva1);
	}

}
