package Kond;
import java.util.regex.*;

public class reg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pt=Pattern.compile("a");
		Matcher mt=pt.matcher("ababbbaab");
		
		while(mt.find()) {
			System.out.println(mt.start()+".........."+mt.group());
		}
		System.out.println("============================================");
		
		Pattern pt1=Pattern.compile("a+");
		Matcher mt1=pt1.matcher("ababbbaab");
		
		while(mt1.find()) {
			System.out.println(mt1.start()+"........"+mt1.group());
		}
		System.out.println("============================================");
		Pattern pt2=Pattern.compile("a*");
		Matcher mt2=pt2.matcher("ababbbaab");
		
		while(mt2.find()) {
			System.out.println(mt2.start()+".........."+mt2.group());
		}
		System.out.println("============================================");
		Pattern pt3=Pattern.compile("a?");
		Matcher mt3=pt3.matcher("ababbbaab");
		
		while(mt3.find()) {
			System.out.println(mt3.start()+"........."+mt3.group());
		}

	}

}
