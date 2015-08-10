import java.util.Scanner;
public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           int year = scn.nextInt();
           while(year%4!=0||year%100==0&& year%400!=0){
               year = scn.nextInt();
           }
               System.out.print(year+"¬O¶|¦~");
	}

}
