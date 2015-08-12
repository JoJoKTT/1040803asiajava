import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           String str = scn.nextLine();
           char[] a = str.toCharArray();
           int len = str.length();
           char[] a1 = new char[len];
           for(int i=0;i<len;i++){
               a1[i]=a[len-i-1];
           }
           String newstr = new String(a1);
           System.out.println(newstr);
	}

}
