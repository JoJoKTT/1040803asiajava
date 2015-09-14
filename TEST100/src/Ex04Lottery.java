import java.util.Random;
public class Ex04Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int a[]=new int[6];
		boolean flag =false;
		for(int i=0;i<6;i++){
		a[i]=ran.nextInt(42)+1;
		flag=false;
		for(int j=0;j<i;j++){
			if(a[i]==a[j]){
				flag=true;
			}
		}
		if(flag==true){
			i--;
		}
		}
		for(int i=0;i<6;i++){
			System.out.print(a[i]+"\t");
		}
	}

}
