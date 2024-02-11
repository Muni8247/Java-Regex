package Kond;
import java.util.regex.*;

public class reg14Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pt=Pattern.compile("0?[7-9][0-9]{9}");
		Matcher mt=pt.matcher("08247621867");
		
		boolean mt1=mt.find();
		System.out.println(mt1);

	}

}
