package Kond;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class reg {
     public static void main(String args[]) {
    	 Pattern pat=Pattern.compile("Muni \\d");
    	 Matcher mat=pat.matcher("Muni 8");
    	 
    	 boolean fn=mat.find();
    	 System.out.println(fn);
     }
}
