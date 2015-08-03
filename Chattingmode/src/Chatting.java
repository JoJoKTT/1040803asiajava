import java.util.Scanner;
public class Chatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
           System.out.print("Hello,請問您是?");
           String name = scn.next();
           System.out.println("HI,"+name+"您好!");
           System.out.print(""+name+",很高興認識你,請問您是哪一所高中畢業的?");
           String school = scn.next();
           System.out.println(""+name+",原來您是"+school+"畢業的。");
           System.out.print("你現在讀哪一個系的?");
           String class1 = scn.next();
           System.out.println("哇~~"+class1+"可是熱門科系耶,你實在是太厲害了! :)");
           System.out.print("你畢業後要從事甚麼工作?");
           String job = scn.next();
           System.out.println(""+job+"是個不錯的工作,真是羨慕你! :)");
           }
	}


