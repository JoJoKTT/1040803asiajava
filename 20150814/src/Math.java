import java.util.Scanner;
public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn= new Scanner(System.in);
           System.out.println("請輸入0~9的數字");
       	   String n=scn.next();
           int sum =(int)fun(n);
           System.out.println("總合為"+sum);
	}
    public static long fun(String v1){
    	long sum=0;
    	int len=v1.length();
    	char[] a=v1.toCharArray();
    	for(int i=0;i<len;i++){
    		int c=a[i]-'0';
    		sum+=c;
    	}
    	return sum;
    }
    
}
