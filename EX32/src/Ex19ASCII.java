import java.util.Scanner;
public class Ex19ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str = scn.next();
		int len=str.length();
		char ch[]=str.toCharArray();
		for(int i=0;i<len;i++){
			if(ch[i]>=65&&ch[i]<=90){
				System.out.println("大寫");
			}else if(ch[i]>=97&&ch[i]<=122){
				System.out.println("小寫");
			}else{
				System.out.println("其他字元");
			}
		}
	}

}
