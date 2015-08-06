import java.util.Scanner;
public class heightweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           int People =scn.nextInt();
           int p = People;
           float sumh = 0;
           float sumw = 0;
           for(p=1;p<=People;p=p+1){
        	   sumh = sumh+scn.nextFloat() ;
        			   sumw = sumw+scn.nextFloat();
           }
        				   
           System.out.print("平均身高為"+sumh/People+"平均體重為"+sumw/People);
	}
}
