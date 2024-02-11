package Kond;
import java.util.regex.*;

public class reg11patsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pt=Pattern.compile("e");
		String[] str=pt.split("Hello Em Peru ne peru");
		
		for(String str1:str) {
			System.out.println(str1);
		}

	}

}
