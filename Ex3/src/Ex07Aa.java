import java.util.Scanner;
public class Ex07Aa {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn=new Scanner(System.in);
			String str = scn.nextLine();
			int len=str.length();
			char ch[]=str.toCharArray();
			for(int i=0;i<len;i++){
				if(ch[i]>=65&&ch[i]<=90){
					ch[i]+=32;
					System.out.print(ch[i]);
				}else if(ch[i]>=97&&ch[i]<=122){
					ch[i]-=32;
					System.out.print(ch[i]);
				}else{
					System.out.print("¨ä¥L¦r¤¸");
				}
			}
		}

}