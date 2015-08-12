import java.util.Random;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random ran = new Random();
        int i=0,v1=0,v2=0,v3=0;
        int[] a = new int[20];
        for(i=0;i<20;i++){
        	a[i]=ran.nextInt(21)-10;
        	if(a[i]>0){
        		v1++;
        	}else{
        		if(a[i]<0){
        			v3++;
        		}else{
        			v2++;
        		}
        	}
        }
        for(i=0;i<20;i++){
            System.out.println(a[i]);
        }
        System.out.println(v1+"個正數\t"+v2+"個0\t"+v3+"個負數");
	}

}
