import java.util.Scanner;
public class NumberSpace {

	private static Scanner scn;
	public static void main(String[] args) {
		scn = new Scanner(System.in);
        long n=scn.nextLong();
		decomp(n);
	}

	public static void decomp(long l){
		String str=String.valueOf(l);
		char[] a = str.toCharArray();
		int len = str.length();
		String m="";
		for(int i=0;i<len;i++){
			m=""+a[i]+" ";
			System.out.print(m);
		}
		}
	}
