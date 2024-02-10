package Kond;
import java.util.regex.*;
public class reg2 {
	public static void main(String args[]) {
		Pattern pat=Pattern.compile("Muni \\d");
		Matcher mat=pat.matcher("Muni 82476");
		
		boolean fn=mat.find();
		
		System.out.println(fn);
	}

}
