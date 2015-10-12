import java.util.Scanner;
public class Ex24t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a[]=new int[3];
		for(int i=0;i<3;i++){
			a[i]=scn.nextInt();
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(a[i]<a[j]){
					int v1=a[i];
					a[i]=a[j];
					a[j]=v1;
				}
			}
		}
			if(a[0]+a[1]>a[2]){
				System.out.print("¬O");
			}else{
				System.out.print("¤£¬O");
			}
	}

}
