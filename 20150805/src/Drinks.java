import java.util.Scanner;
public class Drinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
		   String shop = scn.next();
           String drinks = scn.next();
           int price = scn.nextInt();
           if(shop.equals("五十嵐")){
        	   System.out.println("不買");
           }else{
        	   if((drinks.equals("綠茶") || drinks.equals("咖啡"))&& price<=45 &&price>0){
        	   System.out.println("買");
           }else{
        	   System.out.println("不買");
           }
           
	}
	}
}
