import java.util.Date;

import com.innowake.formatter.DateFormatter;
import com.innowake.formatter.FormatterFactory;
import com.innowake.formatter.FormatterType;

public class DateFormatterTest {

	public static DateFormatter dateFormatter = (DateFormatter) FormatterFactory.getFormatter(FormatterType.date);

	public static void main(String[] args) {
		
		System.out.println("isValid(\"Wed, 4 Jul 2001\"): " + dateFormatter.isValid("Wed, 4 Jul 2001"));

		System.out.println("isValid(\"foo\"): " + dateFormatter.isValid("foo"));
		
		System.out.println("format(new Date()): " + dateFormatter.format(new Date()));
		
		System.out.println("parse(\"Wed, 4 Jul 2001\"): " + dateFormatter.parse("Wed, 4 Jul 2001"));		
	}

}
