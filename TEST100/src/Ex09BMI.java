import java.util.Scanner;
public class Ex09BMI {
//���ϥΪ̿�J�ʧO�P�����A�è̾ڨk�k���P, ���o(�L)�p��ÿ�X��з��魫 (�k�G(����-170)*0.6+62 �k�G(����-158)*0.5+52)�C
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�ʧO(�k/�k)");
		String sex=scn.next();
		String boy="�k";
		String girl="�k";
		if(sex.equals(boy)){
			int h=scn.nextInt();
			int BMI1=(int) ((h-170)*0.6+62);
			System.out.println(BMI1);
		}else if(sex.equals(girl)){
			int h=scn.nextInt();
			int BMI1=(int) ((h-158)*0.5+62);
			System.out.println(BMI1);
		}
	}

}
