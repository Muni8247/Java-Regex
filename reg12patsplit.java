package Kond;
import java.util.regex.*;
public class reg12patsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pt=Pattern.compile("[.]");
		String[] str=pt.split("www.durgasoft.com");
		
		for(String str1:str) {
			System.out.println(str1);
		}

	}

}
