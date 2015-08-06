import java.util.Scanner;
public class Seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           int i=13;
           int sum = 0;
           int r=17-i;
           if(i%17==0){
        	   for(i=13;i<=1399;i=i+17){
        		   sum=sum+i;
        	   }
}else{
	for(i=i+r;i<=1399;i=i+17){
		sum = sum+i;
	}
}
    	   System.out.print("sum="+sum);
	}

}
