package Kond;
import java.util.regex.*;
public class reg3 {public static void main(String args[]) {
	Pattern pat=Pattern.compile("Muni \\d+");
	Matcher mat=pat.matcher("Muni 8987654323456789");
	
	boolean bl=mat.find();
	
	System.out.println(bl);
}

}
