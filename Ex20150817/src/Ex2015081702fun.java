import java.util.Random;
public class Ex2015081702fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random ran=new Random();
        int k=ran.nextInt(1000)+1;
        System.out.println(k);
        fun(k);
	}
	public static int fun(int n){
		if(n>=1000){
			System.out.print(n/1000+"¤d");
			return fun(n%=1000);
		}if(n>=100){
			System.out.print(n/100+"¦Ê");
			if(n%10==0){
				System.out.print("¹s");
			}
			return fun(n%=100);
		}if(n>=10){
			System.out.print(n/10+"¬B");
			return fun(n%=10);
		}if(n>0){
			System.out.print(n/1);
		}System.out.print("¤¸");
		return n;
	}
}
