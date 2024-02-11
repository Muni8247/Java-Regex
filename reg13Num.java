package Kond;
import java.util.regex.*;

public class reg13Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pt=Pattern.compile("[0-9]{10}");
		Matcher mt=pt.matcher("8247621867");
		
		boolean mt1=mt.find();
		System.out.println(mt1);

	}

}
