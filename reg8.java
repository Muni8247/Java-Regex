package Kond;
import java.util.regex.*;

public class reg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pt=Pattern.compile("\\s");//Finding space
		Pattern pt1=Pattern.compile("\\S");//Except space
		
		Matcher mt=pt.matcher("a@3t gb&10");
		Matcher mt1=pt1.matcher("a@3t gb&10");

		
		while(mt.find()) {
			System.out.println(mt.start()+"......."+mt.group());
		}
		System.out.println("==========");
		while(mt1.find()) {
			System.out.println(mt1.start()+"......."+mt1.group());
		}
		System.out.println("==============================================");
		Pattern pt2=Pattern.compile("\\d");//Any digit[0-9]
		Pattern pt3=Pattern.compile("\\D");//Except digit Alpha and spl char
		
		Matcher mt2=pt2.matcher("a@3t gb&10");
		Matcher mt3=pt3.matcher("a@3t gb&10");

		
		while(mt2.find()) {
			System.out.println(mt2.start()+"......."+mt2.group());
		}
		System.out.println("==========");
		while(mt3.find()) {
			System.out.println(mt3.start()+"......."+mt3.group());
		}
		System.out.println("==============================================");
		Pattern pt4=Pattern.compile("\\w");//Any word char aAzZ0-9
		Pattern pt5=Pattern.compile("\\W");//Except word char
		
		Matcher mt4=pt4.matcher("a@3t gb&10");
		Matcher mt5=pt5.matcher("a@3t gb&10");

		
		while(mt4.find()) {
			System.out.println(mt4.start()+"......."+mt4.group());
		}
		System.out.println("==========");
		while(mt5.find()) {
			System.out.println(mt5.start()+"......."+mt5.group());
		}
		System.out.println("==============================================");
        Pattern pt6=Pattern.compile(".");
        Matcher mt6=pt6.matcher("a@3t gb&10");
        
        while(mt6.find()) {
        	System.out.println(mt6.start()+"......"+mt6.group());
        }

	}

}
