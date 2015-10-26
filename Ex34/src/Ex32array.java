import java.util.Random;
public class Ex32array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran=new Random();
		int a[][]=new int[5][7];
		int a1[][]=new int[7][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<7;j++){
				a[i][j]=ran.nextInt(101);
				a1[j][i]=a[i][j];
				System.out.print(a1[j][i]+" ");
			}System.out.println();
		}
	}

}
