import com.innowake.customtype.Employee;
import com.innowake.formatter.EmployeeFormatter;
import com.innowake.formatter.FormatterFactory;
import com.innowake.formatter.FormatterType;

public class EmployeeFormatterTest {

	public static EmployeeFormatter emplFormatter = (EmployeeFormatter) FormatterFactory
			.getFormatter(FormatterType.employee);

	public static void main(String[] args) {

		System.out.println("isValid(\"John#Doe#111-11-1111\"): " + emplFormatter.isValid("John#Doe#111-11-1111"));

		System.out.println("format(new Employee(\"Peter\", \"Smith\", \"222-22-2222\")): "
				+ emplFormatter.format(new Employee("Peter", "Smith", "222-22-2222")));

		System.out.println("parse(\"John#Doe#111-11-1111\")): " + emplFormatter.parse("John#Doe#111-11-1111"));

	}

}
