import java.util.Scanner;
public class Drinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
		   String shop = scn.next();
           String drinks = scn.next();
           int price = scn.nextInt();
           if(shop.equals("���Q�P")){
        	   System.out.println("���R");
           }else{
        	   if((drinks.equals("���") || drinks.equals("�@��"))&& price<=45 &&price>0){
        	   System.out.println("�R");
           }else{
        	   System.out.println("���R");
           }
           
	}
	}
}
