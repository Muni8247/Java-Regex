package Kond;
import java.util.regex.*;
public class reg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pt=Pattern.compile("[a-z]");
		Pattern pt1=Pattern.compile("[A-Z]");
		Pattern pt2=Pattern.compile("[0-9]");
		Pattern pt3=Pattern.compile("\\p{Alpha}");
		Pattern pt4=Pattern.compile("\\p{Lower}");
		Pattern pt5=Pattern.compile("\\p{Upper}");
		Pattern pt6=Pattern.compile("\\p{Digit}");
		Pattern pt7=Pattern.compile("\\p{Alnum}");
		Pattern pt8=Pattern.compile("\\p{Punct}");
		Pattern pt9=Pattern.compile("\\p{Space}");
		Matcher mt=pt.matcher("a7#bcs @$17N");
		Matcher mt1=pt1.matcher("a7#bcs @$17N");
		Matcher mt2=pt2.matcher("a7#bcs @$17N");
		Matcher mt3=pt3.matcher("a7#bcs @$17N");
		Matcher mt4=pt4.matcher("a7#bcs @$17N");
		Matcher mt5=pt5.matcher("a7#bcs @$17N");
		Matcher mt6=pt6.matcher("a7#bcs @$17N");
		Matcher mt7=pt7.matcher("a7#bcs @$17N");
		Matcher mt8=pt8.matcher("a7#bcs @$17N");
		Matcher mt9=pt9.matcher("a7#bcs @$17N");
		
		while(mt.find()) {
			System.out.println(mt.start()+"...."+mt.group());
		}
		System.out.println("==============");
		while(mt1.find()) {
			System.out.println(mt1.start()+"...."+mt1.group());
		}
		System.out.println("==============");
		while(mt2.find()) {
			System.out.println(mt2.start()+"...."+mt2.group());
		}
		System.out.println("==============");
		while(mt3.find()) {
			System.out.println(mt3.start()+"...."+mt3.group());
		}
		System.out.println("==============");
		while(mt4.find()) {
			System.out.println(mt4.start()+"...."+mt4.group());
		}
		System.out.println("==============");
		while(mt5.find()) {
			System.out.println(mt5.start()+"...."+mt5.group());
		}
		System.out.println("==============");
		while(mt6.find()) {
			System.out.println(mt6.start()+"...."+mt6.group());
		}
		System.out.println("==============");
		while(mt7.find()) {
			System.out.println(mt7.start()+"...."+mt7.group());
		}
		System.out.println("==============");
		while(mt8.find()) {
			System.out.println(mt8.start()+"...."+mt8.group());
		}
		System.out.println("==============");
		while(mt9.find()) {
			System.out.println(mt9.start()+"...."+mt9.group());
		}

	}

}
