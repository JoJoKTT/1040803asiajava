import java.util.Scanner;
public class DeleteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		System.out.print(fun(str));
	}
	public static String fun(String n){
		int n1 = n.length();
		String str="";
		char[]a=n.toCharArray();
		for(int i=0;i<n1;i++){
		if(a[i]!=' '){
			str+=a[i];
		}
		}return str;
	}
}
