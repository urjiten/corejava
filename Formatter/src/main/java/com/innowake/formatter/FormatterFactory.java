package com.innowake.formatter;

// Class that provides a formatter based on a type
// implements singleton pattern to ensure there is only a single instance
public class FormatterFactory {

	public static FormatterFactory instance;
	
	public static FormatterFactory getInstance() {
		if (instance == null) {
			instance = new FormatterFactory();
		}
		return instance;
	}
	
	
	public static Formatter getFormatter(int type) {
		if (type == FormatterType.date) {
			return new DateFormatter();
		} else if (type == FormatterType.employee) {
			return new EmployeeFormatter();
		} else {
			return null;
		}
	}
}
