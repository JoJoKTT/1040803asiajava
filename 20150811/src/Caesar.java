import java.util.Scanner;
public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.println("�п�J���e");
           String str = scn.nextLine();
           char[]a= str.toCharArray();
           int len=str.length();
           System.out.println("�п�J���_");
           int key = scn.nextInt();
           for(int i=0;i<len;i++){
        	   a[i]=(char)(a[i]+key);
           }
           String newstr = new String(a);
           System.out.println(newstr);
           System.out.println("�O�_�ѱK(y/n)");
           String str1 = scn.next(); 
           if(str1.equals("Y")||str1.equals("y")){
               for(int i=0;i<len;i++){
            	   a[i]=(char)(a[i]-key);
               }
           String newstr1= new String(a);
           System.out.println(newstr1);
	       }else{
		   System.out.println("�~�����A�ݫ�!!");
	}
	}
}
