package com.innowake.formatter;

import java.text.MessageFormat;
import java.text.ParseException;

import com.innowake.customtype.Employee;

// formatter for Employees
// expected format: "firstName#lastName#ssn"
public class EmployeeFormatter extends Formatter {

	@Override
	public String format(Object object) {

		Employee employee = (Employee) object;
		String formattedMessage = MessageFormat.format("{0}#{1}#{2}", employee.getFirstName(), employee.getLastName(),
				employee.getSsn());
		return formattedMessage;

		/*
		 * data = (Employee) object; StringBuffer buffer = new StringBuffer();
		 * buffer.append(((Employee)data).getFirstName()); buffer.append("#");
		 * buffer.append(((Employee)data).getLastName()); buffer.append("#");
		 * buffer.append(((Employee)data).getSsn()); return buffer.toString();
		 */
	}

	@SuppressWarnings("unchecked")
	@Override
	public Employee parse(String text) {

		MessageFormat messageFormatter = new MessageFormat("{0}#{1}#{2}");
		Employee employee = new Employee();

		Object[] obj = null;
		try {
			obj = messageFormatter.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		employee.setFirstName((String) obj[0]);
		employee.setLastName((String) obj[1]);
		employee.setSsn((String) obj[2]);
		return employee;

		/*
		 * Employee employee = new Employee();
		 * employee.setFirstName(text.split("#")[0]);
		 * employee.setLastName(text.split("#")[1]);
		 * employee.setSsn(text.split("#")[2]); return employee;
		 */
	}

	@Override
	public boolean isValid(String text) {
		// TODO Auto-generated method stub
		return parse(text) != null;
	}

}