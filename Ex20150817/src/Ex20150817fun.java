import java.util.Random;
public class Ex20150817fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random ran=new Random();
        int k=1000-ran.nextInt(1000)+1;
        System.out.println(k);
        fun(k);
	}
	public static int fun(int n){
		if(n>500){
			System.out.println(n/500+"張500元");
			n%=500;
		}if(n>100){
			System.out.println(n/100+"張100元");
			n%=100;
		}if(n>50){
			System.out.println(n/50+"個50元");
			n%=50;
		}if(n>10){
			System.out.println(n/10+"個10元");
			n%=10;
		}if(n>5){
			System.out.println(n/5+"個5元");
			n%=5;
		}if(n!=0){
			System.out.println(n/1+"個1元");
		}return n;
	}
	
}
