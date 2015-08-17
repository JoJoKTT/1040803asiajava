import java.util.Random;
public class Ex201508172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int p=ran.nextInt(1000)+1;
		System.out.println(p);
		fac(p);
	}
	public static void fac(int p){
		int[]b={1000,100,10,1};
		String[]c={"¤d","¦Ê","¬B","¤¸"};
		int[]a=new int[b.length];
		for(int i=0;i<b.length;i++){
			a[i]=(p-p%b[i])/b[i];
			p=p%b[i];
			if(a[i]>0){
			System.out.print(a[i]+c[i]+"\t");
			}
		}
	}
}
