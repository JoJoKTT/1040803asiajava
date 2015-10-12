import java.util.Scanner;
public class Ex10palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		int len=str.length();
		boolean flag=false;
		char a[]=str.toCharArray();
		for(int i=0;i<len;i++){
			if(flag==false){
			if(a[i]==a[len-i-1]){
				flag=false;
			}else{
				flag=true;
			}
		}
		}
		if(flag==true){
			System.out.println("¤£¬O");
		}else{
			System.out.println("¬O");
		}
	}

}
