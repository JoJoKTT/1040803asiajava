import java.util.Scanner;
public class EX005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int s=scn.nextInt();
		if(s>97){
			System.out.println("A+");
		}else if(s>93){
			System.out.println("A");
		}else if(s>89){
			System.out.println("A-");
		}else if(s>86){
			System.out.println("B+");
		}else if(s>83){
			System.out.println("B");
		}else if(s>79){
			System.out.println("B-");
		}else if(s>76){
			System.out.println("C+");
		}else if(s>73){
			System.out.println("C");
		}else if(s>69){
			System.out.println("C-");
		}else if(s>66){
			System.out.println("D+");
		}else if(s>63){
			System.out.println("D");
		}else if(s>60){
			System.out.println("D-");
		}else{
			System.out.println("E");
		}
	}

}
