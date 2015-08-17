import java.util.Random;
public class Ex20150817Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int n=1000-ran.nextInt(1000)+1;
		int[]a=new int[6];
		int[]b={500,100,50,10,5,1};
		for(int i=0;i<b.length;i++){
			a[i]=n/b[i];
			n=n%b[i];
			if(a[i]>0){
				System.out.println(a[i]+"­Ó"+b[i]);
			}
		}
	}

}
