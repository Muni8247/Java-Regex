package Kond;
import java.util.regex.*;
public class reg10patsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pt=Pattern.compile("\\s");
		String[] mt=pt.split("Hello Naga Muni Reddy");
		
		for(String mt1:mt) {
			System.out.println(mt1);
		}

	}

}
