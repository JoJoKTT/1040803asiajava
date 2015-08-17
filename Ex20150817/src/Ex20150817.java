import java.util.Random;
public class Ex20150817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random ran=new Random();
        int k=1000-ran.nextInt(1000)+1;
        System.out.println(k);
        int v1=k/500;
        k=k%500;
        int v2=k/100;
        k=k%100;
        int v3=k/50;
        k=k%50;
        int v4=k/10;
        k=k%10;
        int v5=k/5;
        k=k%5;
        int v6=k/1;
        if(v1!=0){
        	System.out.println(v1+"個500");
        }if(v2!=0){
        	System.out.println(v2+"個100");
        }if(v3!=0){
        	System.out.println(v3+"個50");
        }if(v4!=0){
        	System.out.println(v4+"個10");
        }if(v5!=0){
        	System.out.println(v5+"個5");
        }if(v6!=0){
        	System.out.println(v6+"個1");
        }
	}
	
}
