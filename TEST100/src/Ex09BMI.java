import java.util.Scanner;
public class Ex09BMI {
//讓使用者輸入性別與身高，並依據男女不同, 幫她(他)計算並輸出其標準體重 (男：(身高-170)*0.6+62 女：(身高-158)*0.5+52)。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入性別(男/女)");
		String sex=scn.next();
		String boy="男";
		String girl="女";
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
