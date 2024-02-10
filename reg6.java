package Kond;
import java.util.regex.*;
public class reg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Pattern pt=Pattern.compile("ab");
		Matcher mt=pt.matcher("abbaabababaab");
		
		while(mt.find()) {
			count++;
			System.out.println(mt.start()+"...."+mt.end()+"...."+mt.group());
		}
		System.out.println("The count is: "+count);

	}

}
