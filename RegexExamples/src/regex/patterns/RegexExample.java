package regex.patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {

		String input = "“Derek 123 Main St. PA 12345 (412)-537-5555 12/12/1974 dbanas123@gmail.com "
				+ "$1,234 Turtle3Dove 123-45-6789 p* 1 <p>Random Text</p> Mailman Mailwoman "
				+ "Jennifer Jenny Jen <h1>This is Heading</h1> Doctor Doug Dog 000.23.255.222 " + "000.12.12.034 "
				+ "121.234.12.12 " + "23.45.12.56" + " 00.12.123.123123.123 " + "122.23 " + "Hello.IP  "
				+ "456.234.355.222”)";

		String regex = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])"
				+ "\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);

		while (m.find()) {
			System.out.println(m.group());

		}

	}

}
